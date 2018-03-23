package WordCount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;


public class WordCount {

	public static class WordCountMapper extends
			Mapper<LongWritable, Text, Text, IntWritable> {

		private IntWritable one= new IntWritable(1);
		private Text word = new Text("");

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			StringTokenizer tokenizer = new StringTokenizer(line, " ");
			while (tokenizer.hasMoreTokens()) {
				word.set(tokenizer.nextToken());
				//tokenizer.nextToken();
				context.write(word, one);
				//context.write(word,new IntWritable(1));
			}

		}

	}
	
	public static class WordCountReducer extends
			Reducer<Text, IntWritable, Text, IntWritable> {
		IntWritable value;

		public void reduce(Text key, Iterable<IntWritable> values,
				Context context) throws IOException, InterruptedException {
			
			int sum=0;
			
			while (values.iterator().hasNext()) {
				sum += Integer.parseInt(values.iterator().next().toString());
			 }
			context.write(key, new IntWritable(sum));
		}
	}

	public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		@SuppressWarnings("deprecation")
		Job job = new Job(conf);
		
		FileSystem fs= FileSystem.get(conf);
		fs.delete(new Path("/home/cloudera/training/WordCount_Output"), true);
		//fs.delete(new Path(args[1]), true);
		//job.setNumReduceTasks(0);

		job.setJarByClass(WordCount.class);
		job.setMapperClass(WordCountMapper.class);
		job.setCombinerClass(WordCountReducer.class);
		job.setReducerClass(WordCountReducer.class);
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		
		FileInputFormat.addInputPath(job, new Path("/home/cloudera/training/wordcount_test_combiner"));
		FileOutputFormat.setOutputPath(job, new Path("/home/cloudera/training/WordCount_Output"));
		
		//FileInputFormat.addInputPath(job, new Path(args[0]));
		//FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
//		FileInputFormat.addInputPath(job, new Path("hdfs://quickstart.cloudera:8020/user/training/commands_practice_renamed"));
//		FileOutputFormat.setOutputPath(job, new Path("hdfs://quickstart.cloudera:8020/user/training/wordcount_output"));
		
		
		
//		FileInputFormat.addInputPath(job, new Path(args[0]));
//		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}
