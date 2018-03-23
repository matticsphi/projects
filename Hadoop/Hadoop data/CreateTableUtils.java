package hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;
import org.apache.hadoop.hbase.util.Bytes;

public class CreateTableUtils {

	/**
	 * creates a table at the given path.
	 * @param Hbase configuration Object,tablePath, Array of ColumnFamilies
	 * @return true if table is created, false if already exists
	 * @throws IOException
	 */
	public static boolean createTable(Configuration conf, String tablePath, byte[][] colFams,int maxVersion) throws IOException {
		System.out.println("Creating table " + tablePath + "...");
		HBaseAdmin admin = new HBaseAdmin(conf);
		byte[] tablePathBytes = Bytes.toBytes(tablePath);
		boolean avail;
		if (admin.tableExists(tablePathBytes)) {
			System.out.println(" table already exists.");
			//deleteTable(admin, tablePathBytes);
			avail = false;
		}
		else{
			
			HTableDescriptor desc = new HTableDescriptor(TableName.valueOf(tablePathBytes));
			HColumnDescriptor coldef;
			for (byte[] colFam : colFams) {
				coldef = new HColumnDescriptor(colFam);
				coldef.setMaxVersions(maxVersion);
				desc.addFamily(coldef);
			}

			admin.createTable(desc);
			System.out.println("Created table " + tablePath + "...");
			avail = admin.isTableAvailable(tablePathBytes);
			System.out.println("Table " + tablePath + " available: " + avail);

		}
		if (admin != null){
			admin.close();
		}
		return avail;
	}
	public static void deleteTable(HBaseAdmin admin, byte[] tableName) throws IOException {
		if (admin.tableExists(tableName)) {
			System.out.printf("Deleting %s\n", Bytes.toString(tableName));
			if (admin.isTableEnabled(tableName)) {
				admin.disableTable(tableName);
			}
			admin.deleteTable(tableName);
		}
	}
	public static boolean isExists(Configuration conf, byte[] statusTable) throws MasterNotRunningException, ZooKeeperConnectionException, IOException{

		HBaseAdmin admin = new HBaseAdmin(conf);
		if(admin.tableExists(statusTable)){
			return true;
		}
		return false;
	}

}
