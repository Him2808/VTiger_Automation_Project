package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * this class contains all the methods regarding database
 * @author Himanshu
 **/
public class DataBaseUtility {
	 
	Connection c=null;
	/**
	 * this method is use to establish connection
	 * @throws Exception
	 */
	public void establishConnection() throws Exception {
		DriverManager.getConnection(IconstantUtilityv.dbPath, IconstantUtilityv.dbUsername, IconstantUtilityv.dbPassword);
	}
	/**
	 * this method is use to close the connection
	 * @throws Exception
	 */
	public void closeConnection() throws Exception {
		c.close();
	}
	/**
	 * this method is use to execute query
	 * @param query
	 * @param colIndex
	 * @param expectedData
	 * @return
	 * @throws Exception
	 */
	public String executeQueryOperation(String query,int colIndex,String expectedData) throws Exception {
		boolean flag=false;
	    Statement s=c.createStatement();
	    ResultSet rs= s.executeQuery(query);
	   /**
	    * We Can write The Above Lines Using Method Chaining-
	    *  ResultSet rs=c.createStatement().executeQuery(query);
	    */
	    while (rs.next()) {
	    	 String actualData= rs.getString(colIndex);
	    	 if (actualData.equals(expectedData)) { 
				flag=true;
				break;
			}
	    }
	    
	    	 if (flag) {
	    		 System.out.println("ExpectedData is "+expectedData);
				return expectedData;
			}
	    	 else {
				System.out.println("data is not present");
				return "";
			}
		}
	}
