package fr.digincanic.tf.dao;

import java.util.List;
import fr.digincamic.tf.entite.Produit;

public interface ProduitDao 
{
	
	List<Produit> extraire();
    void insert(Produit produit);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Produit produit);
	

}
