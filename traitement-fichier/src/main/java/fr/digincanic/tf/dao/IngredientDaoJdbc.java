package fr.digincanic.tf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import fr.digincamic.tf.entite.*;


public class IngredientDaoJdbc implements IngredientDao 
{
	public static void main(String[] a)
	{
		IngredientDaoJdbc ofo = new IngredientDaoJdbc();
		List<Ingredient> listeIngredient = ofo.extraire();
		for(Ingredient ar : listeIngredient)
		{
			System.out.println(ar);
		}		
		
	}

	public List<Ingredient> extraire() 
	{

		Connection connection = null;
		List<Ingredient> listeIngredients = new ArrayList<>();
		try
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			ResultSet monResultat = monCanal.executeQuery("SELECT * FROM INGREDIENT;");
			while(monResultat.next())
			{
				listeIngredients.add(new Ingredient(monResultat.getId_ingredient("id_Ingredient"), monResultat.getIngredient("Ingredient"),
						monResultat.getId_produit("id_produit")));
			}
			monResultat.close();
			monCanal.close();
			connection.close();
		}
		catch(Exception e)
		{
			System.err.println("Erreur d'éxecution : " + e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null) connection.close();
			}
			catch(SQLException e)
			{
				System.err.println("Probl de connection close : " + e.getMessage());
			}
		}
		return listeIngredients;
	}

	/**fait un insert dans la base de compta sur la table Ingredient*/
	public void insert(Ingredient Ingredient) 
	{
		Connection connection = null;

		try  
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			int nb = monCanal.executeUpdate("INSERT INTO Ingredient (id_ingredient,ingredient,id_produit) values ("
			+Ingredient.getId_ingredient()+",'" + 
					Ingredient.getIngredient()+"','" +Ingredient.getId_produit() +");");
			
			if(nb==1)
			{
				System.out.println("Ingredient ajouté !");
			}
			monCanal.close();
		} 
		catch(Exception e)
		{
			System.err.println("Erreur d'éxecution : " + e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null) connection.close();
			}
			catch(SQLException e)
			{
				System.err.println("Probl de connection close : " + e.getMessage());
			}
		}
	}

	/**
	 * fait un update dans la table Ingredient en changeant le nom ancienNom par nouveauNom
	 */
	public int update(String ancienNom, String nouveauNom) 
	{
		Connection connection = null;
		int nb = 0;

		try  
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			nb = monCanal.executeUpdate("UPDATE Ingredient SET ref ='" + 
			nouveauNom+"' WHERE ref = '"+ancienNom+"';");
			
			monCanal.close();
			
		} 
		catch(Exception e)
		{
			System.err.println("Erreur d'éxecution : " + e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null) connection.close();
			}
			catch(SQLException e)
			{
				System.err.println("Probl de connection close : " + e.getMessage());
			}
		}
		return nb;
	}

	/**
	 *supprime le Ingredient specifie dans la table Ingredient
	 */
	public boolean delete(Ingredient Ingredient) 
	{
		Connection connection = null;
		boolean nb = false;

		try 
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			nb = monCanal.executeUpdate(
					"DELETE FROM Ingredient WHERE id="+ Ingredient.getId_ingredient() +";")
					==1;
			monCanal.close();
		} 
		catch(Exception e)
		{
			System.err.println("Erreur d'éxecution : " + e.getMessage());
		}
		finally
		{
			try
			{
				if(connection != null) connection.close();
			}
			catch(SQLException e)
			{
				System.err.println("Probl de connection close : " + e.getMessage());
			}
		}
		return nb;
	}

	public Connection getConnection() 
	{
		// recupere le fichier properties
		ResourceBundle db = ResourceBundle.getBundle("database");

		try 
		{
			// enregistre le pilote
			Class.forName(db.getString("db.driver"));

			return DriverManager.getConnection(db.getString("db.url"), db.getString("db.user"),
					db.getString("db.pass"));
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
		}
		return null;
	}

}
