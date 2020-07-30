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


public class CategorieDaoJdbc implements CategorieDao 
{
	public static void main(String[] a)
	{
		CategorieDaoJdbc ofo = new CategorieDaoJdbc();
		List<Categorie> listeCategorie = ofo.extraire();
		for(Categorie ar : listeCategorie)
		{
			System.out.println(ar);
		}		
		
	}

	public List<Categorie> extraire() 
	{

		Connection connection = null;
		List<Categorie> listeCategories = new ArrayList<>();
		try
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			ResultSet monResultat = monCanal.executeQuery("SELECT * FROM Categorie;");
			while(monResultat.next())
			{
				listeCategories.add(new Categorie(monResultat.getId_categorie("id"), monResultat.getCategorie("ref"),
						monResultat.getId_produit("designation"), monResultat.getId_marque("prix")));
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
		return listeCategories;
	}

	/**fait un insert dans la base de compta sur la table Categorie*/
	public void insert(Categorie Categorie) 
	{
		Connection connection = null;

		try  
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			int nb = monCanal.executeUpdate("INSERT INTO Categorie (id_categorie,categorie,id_produit,id_marque) values ("
			+Categorie.getId_categorie()+",'" + 
					Categorie.getCategorie()+"','" +Categorie.getId_produit()+"'," +
					Categorie.getId_marque()+");");
			
			if(nb==1)
			{
				System.out.println("Categorie ajouté !");
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
	 * fait un update dans la table Categorie en changeant le nom ancienNom par nouveauNom
	 */
	public int update(String ancienNom, String nouveauNom) 
	{
		Connection connection = null;
		int nb = 0;

		try  
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			nb = monCanal.executeUpdate("UPDATE Categorie SET ref ='" + 
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
	 *supprime le Categorie specifie dans la table Categorie
	 */
	public boolean delete(Categorie Categorie) 
	{
		Connection connection = null;
		boolean nb = false;

		try 
		{
			connection = getConnection();
			Statement monCanal = connection.createStatement();
			nb = monCanal.executeUpdate(
					"DELETE FROM Categorie WHERE id="+ Categorie.getId_categorie() +";")
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
