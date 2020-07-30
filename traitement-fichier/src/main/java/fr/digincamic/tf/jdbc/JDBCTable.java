package fr.digincamic.tf.jdbc;

import java.sql.*;

public class JDBCTable 
{
	
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/traitement_fichier";

	   
	   static final String USER = "root";
	   static final String PASS = "";
	   
	   public static void main(String[] args) 
	   {
		   
		   Connection conn = null;
		   Statement stmt = null;
		   try
		   {
		   
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      System.out.println("Creating table in given database...");
			      stmt = conn.createStatement();
		   
			      String sqlCategorie = "CREATE TABLE IF NOT EXISTS CATEGORIE" +
		                   "(id_categorie INTEGER not NULL, " +
		                   " categorie VARCHAR(255), " + 
		                   " id_produit INTEGER, " + 
		                   " id_marquee INTEGER, " + 
		                   " PRIMARY KEY ( id_categorie )) engine=innodb ;"; 

			        
			      String sqlMarque = "CREATE TABLE IF NOT EXISTS MARQUE" +
		                   "(id_marquee INTEGER not NULL, " +
		                   " marque VARCHAR(255), " + 
		                   " id_produit INTEGER not NULL, " + 
		                   " id_categorie INTEGER not NULL, " + 
		                   " PRIMARY KEY ( id_marquee )) engine=innodb ;"; 
			      
			     
			      String sqlIngredient = "CREATE TABLE IF NOT EXISTS INGREDIENT" +
		                   "(id_ingredient INTEGER not NULL, " +
		                   " ingredient VARCHAR(255), " + 
		                   " id_produit INTEGER not NULL, " + 
		                   " PRIMARY KEY ( id_ingredient )) engine=innodb ;"; 
			     
			      
			      String sqlProduit = "CREATE TABLE IF NOT EXISTS PRODUIT" +
		                   "(id_produit INTEGER not NULL, " +
		                   " produit VARCHAR(255), " + 
		                   " id_categorie INTEGER not NULL, " + 
		                   " id_marquee INTEGER not NULL, " + 
		                   " id_ingredient INTEGER not NULL, " + 
		                   " PRIMARY KEY ( id_produit )) engine=innodb ;"; 
			      
			      String sqlAdditifs = "CREATE TABLE IF NOT EXISTS ADDITIFS" +
		                   "(id_additifs INTEGER not NULL, " +
		                   " additifs VARCHAR(255), " + 
		                   " id_produit INTEGER not NULL, " + 
		                   " PRIMARY KEY ( id_additifs )) engine=innodb ;"; 
			      
			      
			      String sqlAllergenes = "CREATE TABLE IF NOT EXISTS ALLERGENES" +
		                   "(id_allergenes INTEGER not NULL, " +
		                   " allergenes VARCHAR(255), " + 
		                   " id_produit INTEGER not NULL, " + 
		                   " PRIMARY KEY ( id_allergenes )) engine=innodb ;"; 			      
			      

			      stmt.executeUpdate(sqlCategorie);
			      stmt.executeUpdate(sqlMarque);
			      stmt.executeUpdate(sqlIngredient);
			      stmt.executeUpdate(sqlProduit);     
			      stmt.executeUpdate(sqlAdditifs);
			      stmt.executeUpdate(sqlAllergenes);
			      
			      System.out.println("Created ALL table in given database...");
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
			            conn.close();
			      }
			      catch(SQLException se)
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
			   
			   System.out.println("Goodbye!");
		   }
		   
	   }
	   
}






