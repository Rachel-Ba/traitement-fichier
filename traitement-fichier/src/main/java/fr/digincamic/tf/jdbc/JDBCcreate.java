package fr.digincamic.tf.jdbc;

import java.sql.*;

public class JDBCcreate 
{
	
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306";

	   
	   static final String USER = "root";
	   static final String PASS = "";
	   
	   public static void main(String[] args) 
	   {
		   Connection conn = null;
		   Statement stmt = null;
		   try
		   {
		   
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			   System.out.println("Connecting to database...");
			   conn = DriverManager.getConnection(DB_URL, USER, PASS);
			   
			   System.out.println("Creating database...");
			   stmt = conn.createStatement();
			   
			   String sql = "CREATE DATABASE IF NOT EXISTS traitement_fichier";
			   stmt.executeUpdate(sql);
			   
		
			   System.out.println("Database created successfully...");
		   }
		   catch(SQLException se)
		   {
				      se.printStackTrace();
		   }
		   catch(Exception e)
		   {
			      e.printStackTrace();
		   }
		   finally
		   {
			      try
			      {
			         if(stmt!=null)
			            stmt.close();
			      }
			      catch(SQLException se2)
			      {
			      }
			      try
			      {
			         if(conn!=null)
			            conn.close();
			      }
			      catch(SQLException se)
			      {
			         se.printStackTrace();
			      }
			   }
			   System.out.println("Goodbye!");
	   }

}
