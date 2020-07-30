package fr.digincamic.tf;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import fr.digincamic.tf.entite.*;

public class lectureFichier 
{
	
	public static void main (String[] args)
	{
		File file = new File("C:/Users/Dell/git/traitement-fichier/traitement-fichier/src/main/resources/open-food-facts.csv");

		try 
		{
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			for (String ligne : lignes) 
			{				
				ligne = ligne.replaceAll("_","");
				ligne = ligne.replaceAll("%","");
				ligne = ligne.replaceAll(";",",");
				ligne = ligne.replaceAll("\\*"," ");
				ligne = ligne.toLowerCase();
				String[] decoupage = ligne.split("\\|",-1);
				String categorie = decoupage[0];
				String marque = decoupage[1];
				String produit = decoupage[2];
				String ingredient = decoupage[4];
				String allergie = decoupage[27];
				String additif = decoupage[28];

				System.out.println(Arrays.toString(decoupage));

			}

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
