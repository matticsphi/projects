package hbase;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

public class HbaseClient {
	public static String statusTable = "test";
	public static String rowkey = "row1";
	public static String tableCFamily = "cf1";
	public static String columnQualifier = "lastname";


	public static void main(String[] args) throws MasterNotRunningException, ZooKeeperConnectionException, IOException {
		//Instantiate Config
		Configuration config = HBaseConfiguration.create();
		//config.set("hbase.zookeeper.quorum"," qa-mapr-node1.fishbowl.com,qa-mapr-node2.fishbowl.com,qa-mapr-node3.fishbowl.com");
		//config.set("hbase.zookeeper.quorum","10.30.0.191,10.30.0.192,10.30.0.193");
		//config.set("hbase.zookeeper.property.clientPort", "5181");
		// Set up schema variables for table status
		HBaseAdmin admin = new HBaseAdmin(config);
		HTable table = null;
		
		String lastProcessedValue = "keshetty";
		//String lastProcessedValue=dateformat.format(date);
		

		//Put row = new Put(Bytes.toBytes(rowkey));
		//put 'tablename','rowkeyvalue','columnfamily:columnname','Value'
		
		//put 'status','1_otb_tables','Tables:store','2015-09-27'
		Put row = putValues(rowkey,tableCFamily,columnQualifier,lastProcessedValue);
		
		

		
		//row.add(Bytes.toBytes(tableCFamily) , Bytes.toBytes(columnQualifier),Bytes.toBytes(lastProcessedValue));
		if(admin.tableExists(Bytes.toBytes(statusTable))){
			table = new HTable(config,statusTable);
			table.put(row);
		}else{
			CreateTableUtils.createTable(config, statusTable, new byte[][] { Bytes.toBytes(tableCFamily) },3);
			table = new HTable(config,statusTable);
			table.put(row);
		}
		
		/*Get getRow = new Get(Bytes.toBytes(rowkey));
		Result result = table.get(getRow);
		byte [] value = result.getValue(Bytes.toBytes(tableCFamily),Bytes.toBytes(columnQualifier));
		String valueStr = Bytes.toString(value);*/
		String valueStr =  getValues(rowkey, tableCFamily, columnQualifier, table);
		System.out.println(valueStr);


		if(table!=null){
			table.close();

		}
		if(admin!=null){
			admin.close();
		}


	}


	private static Put putValues(String rowKey, String tableCF,String columnName, String latestProcessedValue) {
		Put row = new Put(Bytes.toBytes(rowKey));
		row.add(Bytes.toBytes(tableCF) , Bytes.toBytes(columnName),Bytes.toBytes(latestProcessedValue));
		return row;
	}
	
	private static String getValues(String rowKey, String tableCF,String columnName,HTable table) throws IOException {
		Get getRow = new Get(Bytes.toBytes(rowKey));
		Result result = table.get(getRow);
		byte [] value = result.getValue(Bytes.toBytes(tableCF),Bytes.toBytes(columnName));
		String valueStr = Bytes.toString(value);
		return valueStr;
	}

}
