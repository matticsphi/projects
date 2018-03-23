package WordCount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Partitioner;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Reducer.Context;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

import WordCount.MaxTemperatureMean.MaxTemperatureCombiner;
import WordCount.MaxTemperatureMean.MaxTemperatureMapper;
import WordCount.MaxTemperatureMean.MaxTemperatureReducer;

public class PartitionerExample {


	public static class PartitionerMapper extends
			Mapper<LongWritable, Text, Text, Text> {

		private Text valueout= new Text("");
		private Text keyout = new Text("");

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			int count=0;
			int sum=0;
			while (tokenizer.hasMoreTokens()) {
				keyout.set(tokenizer.nextToken()+"-"+tokenizer.nextToken());
				//tokenizer.nextToken();
				valueout.set(tokenizer.nextToken());
				context.write(keyout, valueout);
			}

		}

	}
	
	public static class PartitionerCombiner extends
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
	
	public static class Partitionertest extends Partitioner<Text, Text> {
	


	@Override
	public int getPartition(Text key, Text value, int reducetasks) {
		
		String[] str = key.toString().split("-");
		
		if (reducetasks==0){
			return 0;
		}
		if (str[0].trim().equals("CA")){
		
			return 1;
		}
		else if (str[0].equals("TX")){
			
			return 2;
		}
		else {
			return 0;
		}
	}
	}

	public static class PartitionerReducer extends
			Reducer<Text, Text, Text, Text> {
		Text value = new Text("");

		public void reduce(Text key, Iterable<Text> values,
				Context context) throws IOException, InterruptedException {
			float avg;
			int sum=0, count=0;
			String token="";
		//	int token;
			int max=0;
			
			while (values.iterator().hasNext()) {
				//token = Integer.parseInt(values.iterator().next().toString());
				token = values.iterator().next().toString();
//				if(max < token) {
//					max=token;
//				}
				
				
				StringTokenizer tokenizer = new StringTokenizer(token, ";");
				sum=Integer.parseInt(tokenizer.nextToken());
				count= Integer.parseInt(tokenizer.nextToken());				
			}
			avg = sum/count;
			 value.set(String.valueOf(avg));
			
			//System.out.println("Mean Value is" + mean);
			context.write(key,value);
		}
	}

	public static void main(String args[]) throws IOException, ClassNotFoundException, InterruptedException {

		Configuration conf = new Configuration();
		//conf.set("mapred.max.split.size", "600");
		@SuppressWarnings("deprecation")
		Job job = new Job(conf);
		
		FileSystem fs= FileSystem.get(conf);
		fs.delete(new Path("/home/cloudera/training/Partitioner_Output"), true);
		/*
		FileSystem fs= FileSystem.get(conf);
		fs.delete(new Path(args[1]), true);*/

		job.setJarByClass(PartitionerExample.class);
		
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		job.setMapperClass(PartitionerMapper.class);
		job.setCombinerClass(PartitionerCombiner.class);
		job.setPartitionerClass(Partitionertest.class);
		job.setReducerClass(PartitionerReducer.class);
		job.setNumReduceTasks(3);
		//job.setNumReduceTasks(0);
		
	
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
				
		FileInputFormat.addInputPath(job, new Path("/home/cloudera/training/Partitioner_input/partitioner_input"));
		FileOutputFormat.setOutputPath(job, new Path("/home/cloudera/training/Partitioner_Output"));
		//FileInputFormat.addInputPath(job, new Path(args[0]));
		//FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		System.exit(job.waitForCompletion(true) ? 0 : 1);
	}



}
