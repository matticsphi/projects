package WordCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
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
import org.apache.hadoop.mapreduce.lib.input.MultipleInputs;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;



public class SimpleJoin {
	
	public static class EmployeeMapper extends
	Mapper<LongWritable, Text, Text, Text> {

		
		private Text KeyOut = new Text("");
		private Text ValueOut = new Text("");

		public void map(LongWritable key, Text value, Context context)
				throws IOException, InterruptedException {
			String line = value.toString();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			while (tokenizer.hasMoreTokens()) {
				KeyOut.set(tokenizer.nextToken());
				ValueOut.set("EMP-"+tokenizer.nextToken());
				context.write(KeyOut, ValueOut);
				
			}

		}

	}
	
	public static class EmpDeptMapper extends
	Mapper<LongWritable, Text, Text, Text> {

	
		private Text KeyOut = new Text("");
		private Text ValueOut = new Text("");
	

		

			public void map(LongWritable key, Text value, Context context)
					throws IOException, InterruptedException {
				String line = value.toString();
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				while (tokenizer.hasMoreTokens()) {
					KeyOut.set(tokenizer.nextToken());
					ValueOut.set("DEP-"+tokenizer.nextToken());
					context.write(KeyOut, ValueOut);
					
				

			}

		}

	}
	
	
	public static class JoinReducer extends Reducer<Text, Text, Text, Text> {
		IntWritable value;
		
		private static Map <String,String> deptLoopUp = new HashMap<String,String>();
		

		
//		public void configure(Job job){
//			loadDeptLookUp();
//		}
		
		public void loadDeptLookUp(FileReader file){
			
			String str;
			
			try {
	                     //BufferedReader reader = new BufferedReader(new FileReader("/home/cloudera/training/Join_Input/Department_lookup"));
				 BufferedReader reader = new BufferedReader(file);
	                    
	                     while ((str=reader.readLine() ) != null)
	                     {
	                           String splitarray[] = str.split(",");
	                           //parse record and load into HahMap
	                           deptLoopUp.put(splitarray[0].trim(), splitarray[1].trim());  
	                     }
	                     
	                     System.out.println("File Reading done");
	              }
	              catch (FileNotFoundException e) {
	              e.printStackTrace();
	              }catch( IOException e ) {
	                       e.printStackTrace();
	                }
	             
	       }
		
		@Override
		protected void setup(Reducer<Text, Text, Text, Text>.Context context)
				throws IOException, InterruptedException {
			
			FileReader file = new FileReader("Department_lookup");
			loadDeptLookUp(file);	
			super.setup(context);
			
		}

		public void reduce(Text key, Iterable<Text> values,Context context) throws IOException, InterruptedException {
			
			//loadDeptLookUp();
			
			Text emp = new Text(""); 
			Text dept = new Text("");

			while (values.iterator().hasNext()) {
				String[] temp = values.iterator().next().toString().split("-");
				if(temp[0].equals("EMP")){
					
					emp.set(temp[1].trim());
					
				} else if (temp[0].equals("DEP")){
					
					dept.set(deptLoopUp.get(temp[1].trim()));
					//dept.set(temp[1].trim());

				}
			}
			context.write(emp, dept);
		}
			
		}

		
	
	

	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException, URISyntaxException {
		
		Configuration conf = new Configuration();
		@SuppressWarnings("deprecation")
		Job job = new Job(conf);
		
        //job.addCacheFile(new URI("hdfs://quickstart.cloudera:8020/user/training/Join_Input/Department_lookup#Department_lookup"));
		job.addCacheFile(new URI("file:///home/cloudera/training/Join_Input/Department_lookup#Department_lookup"));
		//job.addCacheFile(new URI(args[3]));


        URI[] cacheFiles= job.getCacheFiles();
        if(cacheFiles != null) {
            for (URI cacheFile : cacheFiles) {
                System.out.println("Cache file ->" + cacheFile);
            }
        }
		
		FileSystem fs= FileSystem.get(conf);
		fs.delete(new Path("/home/cloudera/training/Join_Output"), true);
		//fs.delete(new Path(args[1]), true);

		job.setJarByClass(WordCount.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);
		job.setReducerClass(JoinReducer.class);
		//FileInputFormat.addInputPath(job, new Path("/home/cloudera/training/wordcount_test"));
		MultipleInputs.addInputPath(job, new Path(args[0]), TextInputFormat.class,EmployeeMapper.class);
		MultipleInputs.addInputPath(job, new Path(args[1]), TextInputFormat.class,EmpDeptMapper.class);
		FileOutputFormat.setOutputPath(job, new Path(args[2]));
		System.exit(job.waitForCompletion(true) ? 0 : 1);
		
	}

}
