package fr.digincanic.tf.dao;
import java.util.List;
import fr.digincamic.tf.entite.Additifs;

public interface AdditifsDao
{
	
	List<Additifs> extraire();
    void insert(Additifs additifs);
    int update(String ancienNom, String nouveauNom);
    boolean delete(Additifs additifs);

}
