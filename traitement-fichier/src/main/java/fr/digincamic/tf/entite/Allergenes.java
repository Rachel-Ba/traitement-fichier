package fr.digincamic.tf.entite;

public class Allergenes 
{
	
	private int id_allergenes;
	private String allergenes;
	private int id_produit;
	
	
	public Allergenes(int id_allergenes, String allergenes, int id_produit) {
		super();
		this.id_allergenes = id_allergenes;
		this.allergenes = allergenes;
		this.id_produit = id_produit;
	}

	/////////////TO STRING///////////////////////////
	
	@Override
	public String toString() {
		return "Allergenes [id_allergenes=" + id_allergenes + ", allergenes=" + allergenes + ", id_produit="
				+ id_produit + "]";
	}

	//////////////GETTER SETTER//////////////////////
	

	public int getId_allergenes() {
		return id_allergenes;
	}


	public void setId_allergenes(int id_allergenes) {
		this.id_allergenes = id_allergenes;
	}


	public String getAllergenes() {
		return allergenes;
	}


	public void setAllergenes(String allergenes) {
		this.allergenes = allergenes;
	}


	public int getId_produit() {
		return id_produit;
	}


	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	
	
	
	
	

}
