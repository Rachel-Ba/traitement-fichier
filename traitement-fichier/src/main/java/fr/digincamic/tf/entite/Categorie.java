package fr.digincamic.tf.entite;

public class Categorie 
{
	
	private int id_categorie;
	private String categorie;
	private int id_produit;
	private int id_marque;
	
	
	public Categorie(int id_categorie, String categorie, int id_produit, int id_marque) {
		super();
		this.id_categorie = id_categorie;
		this.categorie = categorie;
		this.id_produit = id_produit;
		this.id_marque = id_marque;
	}
	
	/////////////TO STRING///////////////////////////
	
	@Override
	public String toString() 
	{
		return "Categorie [id_categorie=" + id_categorie + ", categorie=" + categorie + ", id_produit=" + id_produit
				+ ", id_marque=" + id_marque + "]";
	}
	
	//////////////GETTER SETTER//////////////////////

	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getId_marque() {
		return id_marque;
	}
	public void setId_marque(int id_marque) {
		this.id_marque = id_marque;
	}
	
	

}
