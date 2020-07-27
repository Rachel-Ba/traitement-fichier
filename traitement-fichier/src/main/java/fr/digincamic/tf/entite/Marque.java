package fr.digincamic.tf.entite;

public class Marque 
{
	
	private int id_marquee;
	private String marque;
	private int id_produit;
	private int id_categorie;
	
	
	public Marque(int id_marquee, String marque, int id_produit, int id_categorie) {
		super();
		this.id_marquee = id_marquee;
		this.marque = marque;
		this.id_produit = id_produit;
		this.id_categorie = id_categorie;
	}
	
	/////////////TO STRING///////////////////////////
	
	
	@Override
	public String toString() 
	{
		return "Marque [id_marquee=" + id_marquee + ", marque=" + marque + ", id_produit=" + id_produit
				+ ", id_categorie=" + id_categorie + "]";
	}
	
	//////////////GETTER SETTER//////////////////////
	
	
	public int getId_marquee() {
		return id_marquee;
	}
	public void setId_marquee(int id_marquee) {
		this.id_marquee = id_marquee;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getId_produit() {
		return id_produit;
	}
	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	public int getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}
	
	
	
	

}
