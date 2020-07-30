package fr.digincamic.tf.entite;

public class Additifs 
{
	
	private int id_additifs;
	private String additifs;
	private int id_produit;
	
	
	public Additifs(int id_additifs, String additifs, int id_produit) {
		super();
		this.id_additifs = id_additifs;
		this.additifs = additifs;
		this.id_produit = id_produit;
	}


	/////////////TO STRING///////////////////////////
	
	@Override
	public String toString() {
		return "Additifs [id_additifs=" + id_additifs + ", additifs=" + additifs + ", id_produit=" + id_produit + "]";
	}


	//////////////GETTER SETTER//////////////////////
	
	public int getId_additifs() {
		return id_additifs;
	}


	public void setId_additifs(int id_additifs) {
		this.id_additifs = id_additifs;
	}


	public String getAdditifs() {
		return additifs;
	}


	public void setAdditifs(String additifs) {
		this.additifs = additifs;
	}


	public int getId_produit() {
		return id_produit;
	}


	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	
	
	
	

}
