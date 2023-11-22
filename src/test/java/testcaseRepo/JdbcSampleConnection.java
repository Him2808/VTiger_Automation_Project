package testcaseRepo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import genericUtility.IconstantUtilityv;

public class JdbcSampleConnection {

	public static void main(String[] args) throws Exception {
		/*Establish connection*/
		Connection c=null;
		try {
		 c=DriverManager.getConnection(IconstantUtilityv.dbPath, IconstantUtilityv.dbUsername, IconstantUtilityv.dbPassword);
		/*Create statement*/
		Statement s=c.createStatement();
		/*Execute query*/
		ResultSet rs=s.executeQuery("select * from students");
		while (rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}

	}
		catch (Exception e) {
			
		}
		/* Close connection*/
		finally {
			c.close();
		}
     
   }
}
