package fr.digincanic.tf.dao;

import java.util.List;
import fr.digincamic.tf.entite.Marque;


public interface MarqueDao 
{
	
	List<Marque> extraire();
    void insert(Marque marque);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Marque marque);
	
	

}
