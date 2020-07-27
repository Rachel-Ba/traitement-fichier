package fr.digincanic.tf.dao;
import java.util.List;
import fr.digincamic.tf.entite.Categorie;


public interface CategorieDao 
{	
	List<Categorie> extraire();
    void insert(Categorie categorie);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Categorie categorie);

}
