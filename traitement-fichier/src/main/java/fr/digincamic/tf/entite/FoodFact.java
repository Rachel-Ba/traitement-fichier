package fr.digincamic.tf.entite;

public class FoodFact 
{
	
	private String categorie;
	private String marque;
	private String produit;
	private String ingredient;
	private String allergenes;
	private String additifs;
	
	
	public FoodFact(String categorie, String marque, String produit, String ingredient, String allergenes,
			String additifs) {
		super();
		this.categorie = categorie;
		this.marque = marque;
		this.produit = produit;
		this.ingredient = ingredient;
		this.allergenes = allergenes;
		this.additifs = additifs;
	}


	@Override
	public String toString() {
		return "FoodFact [categorie=" + categorie + ", marque=" + marque + ", produit=" + produit + ", ingredient="
				+ ingredient + ", allergenes=" + allergenes + ", additifs=" + additifs + "]";
	}


	public String getCategorie() {
		return categorie;
	}


	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}


	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getProduit() {
		return produit;
	}


	public void setProduit(String produit) {
		this.produit = produit;
	}


	public String getIngredient() {
		return ingredient;
	}


	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}


	public String getAllergenes() {
		return allergenes;
	}


	public void setAllergenes(String allergenes) {
		this.allergenes = allergenes;
	}


	public String getAdditifs() {
		return additifs;
	}


	public void setAdditifs(String additifs) {
		this.additifs = additifs;
	}
	
	
	
	
	
	
	
	

	
	

	
	

}
