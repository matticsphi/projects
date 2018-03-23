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
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class MaxTemperatureMean {

	public static class MaxTemperatureMapper extends
			Mapper<LongWritable, Text, Text, Text> {

		private Text one= new Text("");
		private Text word = new Text("");

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			StringTokenizer tokenizer = new StringTokenizer(line, ";");
			while (tokenizer.hasMoreTokens()) {
				word.set(tokenizer.nextToken());
				tokenizer.nextToken();
				one.set(tokenizer.nextToken());
				context.write(word, one);
			}

		}

	}
	
	public static class MaxTemperatureCombiner extends
	Reducer<Text, Text, Text, Text> {
	
	private Text value = new Text("");

	public void reduce(Text key, Iterable<Text> values,
			Context context) throws IOException, InterruptedException {
		int sum=0, count=0;
	
		while (values.iterator().hasNext()) {
			
			sum += Integer.parseInt(values.iterator().next().toString());
			count++;
			
		}
		value.set(sum+";"+count);
		
		//System.out.println("I entered into combiner class");
		context.write(key, value);
	}
	}

	public static class MaxTemperatureReducer extends
			Reducer<Text, Text, Text, IntWritable> {
		IntWritable value;

		public void reduce(Text key, Iterable<Text> values,
				Context context) throws IOException, InterruptedException {
			int mean = 0, sum=0, count=0;
			String token="";
			
			while (values.iterator().hasNext()) {
				token = values.iterator().next().toString();
				StringTokenizer tokenizer = new StringTokenizer(token, ";");
				sum=Integer.parseInt(tokenizer.nextToken());
				count= Integer.parseInt(tokenizer.nextToken());				
			}
			mean = sum/count;
			//System.out.println("Mean Value is" + mean);
			context.write(key, new IntWritable(mean));
		}
	}

	public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		@SuppressWarnings("deprecation")
		Job job = new Job(conf);
		
		FileSystem fs= FileSystem.get(conf);
		fs.delete(new Path(args[1]), true);

		job.setJarByClass(MaxTemperatureMean.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		job.setMapperClass(MaxTemperatureMapper.class);
		job.setCombinerClass(MaxTemperatureCombiner.class);
		job.setReducerClass(MaxTemperatureReducer.class);
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
				
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}

}