package fr.digincanic.tf.dao;

import java.util.List;
import fr.digincamic.tf.entite.Ingredient;

public interface IngredientDao 
{
	
	List<Ingredient> extraire();
    void insert(Ingredient ingredient);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Ingredient ingredient);

}
