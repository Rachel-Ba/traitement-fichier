package fr.digincamic.tf.entite;

public class Ingredient 
{
	private int id_ingredient;
	private String ingredient;
	private int id_produit;
	
	public Ingredient(int id_ingredient, String ingredient, int id_produit) {
		super();
		this.id_ingredient = id_ingredient;
		this.ingredient = ingredient;
		this.id_produit = id_produit;
	}

	
	/////////////TO STRING///////////////////////////
	
	@Override
	public String toString() {
		return "Ingredient [id_ingredient=" + id_ingredient + ", ingredient=" + ingredient + ", id_produit="
				+ id_produit + "]";
	}
	
	
	//////////////GETTER SETTER//////////////////////


	public int getId_ingredient() {
		return id_ingredient;
	}


	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}


	public String getIngredient() {
		return ingredient;
	}


	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}


	public int getId_produit() {
		return id_produit;
	}


	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}
	
	
	
	
	
	
	
	
}
