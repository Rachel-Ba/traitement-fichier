package fr.digincamic.tf.jdbc;
import java.sql.*;

public class JDBCalter 
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
			      
			      String alterCategorie1 = "ALTER TABLE CATEGORIE " + 
			      		"ADD FOREIGN KEY (id_produit) REFERENCES PRODUIT(id_produit);";			      
			      String alterCategorie2 = "ALTER TABLE CATEGORIE " + 
				      		"ADD FOREIGN KEY (id_marquee) REFERENCES MARQUE(id_marquee);";
			      
			      String alterIngredient = "ALTER TABLE INGREDIENT " + 
				      		"ADD FOREIGN KEY (id_produit) REFERENCES PRODUIT(id_produit);";
			      
			      String alterMarque1 = "ALTER TABLE MARQUE " + 
				      		"ADD FOREIGN KEY (id_produit) REFERENCES PRODUIT(id_produit);";			      
				  String alterMarque2 = "ALTER TABLE MARQUE " + 
					      		"ADD FOREIGN KEY (id_categorie) REFERENCES CATEGORIE(id_categorie);";
				  
			      String alterProduit1 = "ALTER TABLE PRODUIT " + 
				      		"ADD FOREIGN KEY (id_categorie) REFERENCES CATEGORIE(id_categorie);";			      
				  String alterProduit2 = "ALTER TABLE PRODUIT " + 
					      		"ADD FOREIGN KEY (id_marquee) REFERENCES MARQUE(id_marquee);";
				  String alterProduit3 = "ALTER TABLE PRODUIT " + 
				      		"ADD FOREIGN KEY (id_ingredient) REFERENCES INGREDIENT(id_ingredient);";
				  
				  String alterAdditifs = "ALTER TABLE ADDITIFS " + 
				      		"ADD FOREIGN KEY (id_produit) REFERENCES PRODUIT(id_produit);";
				  
				  String alterAllergeness = "ALTER TABLE ALLERGENES " + 
				      		"ADD FOREIGN KEY (id_produit) REFERENCES PRODUIT(id_produit);";
			      
			      
			      
			      stmt.executeUpdate(alterCategorie1);
			      stmt.executeUpdate(alterCategorie2);
			      stmt.executeUpdate(alterIngredient);
			      stmt.executeUpdate(alterMarque1);
			      stmt.executeUpdate(alterMarque2);
			      stmt.executeUpdate(alterProduit1);
			      stmt.executeUpdate(alterProduit2);
			      stmt.executeUpdate(alterProduit3);
			      stmt.executeUpdate(alterAdditifs);
			      stmt.executeUpdate(alterAllergeness);
			      System.out.println("Alter ALL table in given database...");
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
