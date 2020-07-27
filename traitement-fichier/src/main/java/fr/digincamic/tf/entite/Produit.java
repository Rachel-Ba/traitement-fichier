package fr.digincamic.tf.entite;

public class Produit 
{
	private int id_produit;
	private String produit;
	private int id_categorie;
	private int id_marque;
	private int id_ingredient;
	
	
	public Produit(int id_produit, String produit, int id_categorie, int id_marque, int id_ingredient) 
	{
		super();
		this.id_produit = id_produit;
		this.produit = produit;
		this.id_categorie = id_categorie;
		this.id_marque = id_marque;
		this.id_ingredient = id_ingredient;

	}
	
	/////////////TO STRING///////////////////////////
	
	
	@Override
	public String toString() 
	{
		return "Produit [id_produit=" + id_produit + ", produit=" + produit + ", id_categorie=" + id_categorie
				+ ", id_marque=" + id_marque + ", id_allergenes=" + id_ingredient + ", id_ingredient=" + "]";
	}
	
	//////////////GETTER SETTER//////////////////////
	
	
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	public int getId_marque() {
		return id_marque;
	}
	public void setId_marque(int id_marque) {
		this.id_marque = id_marque;
	}
	public int getId_ingredient() {
		return id_ingredient;
	}
	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}



}
