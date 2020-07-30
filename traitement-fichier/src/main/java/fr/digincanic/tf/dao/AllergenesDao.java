package fr.digincanic.tf.dao;
import java.util.List;
import fr.digincamic.tf.entite.Allergenes;

public interface AllergenesDao 
{
	
	List<Allergenes> extraire();
    void insert(Allergenes allergenes);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Allergenes allergenes);


}
