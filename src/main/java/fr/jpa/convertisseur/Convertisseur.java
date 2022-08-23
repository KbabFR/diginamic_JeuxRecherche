package fr.jpa.convertisseur;

import java.io.*;

import fr.jpa.model.Jeu;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


/**
 * 
 * @author Valentin Duflot
 * Cette classe a pour but de fournir les outils 
 * nécessaires à la conversion d'une base en .csv 
 * en base en .sql
 * 
 */
public class Convertisseur {
	
	private static EntityManagerFactory sessionFactory; 
	private static EntityManager manager;
	
	/**
	 * Etablit les outils nécessaires à la communication avec la base de données
	 */
	public static void setUp() {
		sessionFactory = Persistence.createEntityManagerFactory("my-persistence-unit"); 
		Convertisseur.manager = sessionFactory.createEntityManager();
	}
	
	/**
	 * @return le EntityManager s'il existe
	 */
	public static EntityManager getManager()  { return manager; } 
	
	public static void main(String[] args) {
		
		setUp();
		
		try {
			File file = new File("base.csv");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String ligne;
			while((ligne=bufferedReader.readLine())!=null) {
				
				stringBuffer.append(ligne);


				creerJeu(stringBuffer.toString());
				stringBuffer.delete(0, stringBuffer.length());
			}
			fileReader.close();
		}
		catch(IOException exception) {  
			exception.printStackTrace();  
		}  
	}
	
	public static void creerJeu(String contenu) {
		
		String[] liste = new String[15];
		
		String[] splitageGuillemet = contenu.split("\"");
		if(splitageGuillemet.length == 1)
		{
			String[] splitage = contenu.split(",");
			for(int i = 0; i < 15; i++) {
	        	
	        	if(splitage.length <= i) {
	        		liste[i] = "0";
	        	}
	        	else {
	        		liste[i] = splitage[i];
	        	}
	        	
	        }
		}
		else {
			liste[0] = splitageGuillemet[0];
			String[] splitage = splitageGuillemet[1].split(",");
			for(int i = 1; i < 15; i++) {
	        	
	        	if(splitage.length <= i) {
	        		liste[i] = "0";
	        	}
	        	else {
	        		liste[i] = splitage[i];
	        	}
	        	
	        }
		}
        		
        String nom = liste[0];
    	String plateforme = liste[1];
    	int anneeDeSortie = Integer.parseInt(liste[2]);
    	String genre = liste[3];
    	String editeur = liste[4];
    	double ventesNA = Double.parseDouble(liste[5]);
    	double ventesEU = Double.parseDouble(liste[6]);
    	double ventesJP = Double.parseDouble(liste[7]);
    	double ventesAutre = Double.parseDouble(liste[8]);
    	double ventesGlobal = Double.parseDouble(liste[9]);
    	float critiqueMoyenne = Float.parseFloat(liste[10]);
    	double nombreCritiques = Double.parseDouble(liste[11]);
    	float notesJoueurs = Float.parseFloat(liste[12]);
    	double nombreNotesJoueurs = Double.parseDouble(liste[13]);
    	String rating = liste[14];
    	
    	
    	Jeu jeu = new Jeu(nom,plateforme,anneeDeSortie,genre,editeur,ventesNA,ventesEU,ventesJP,ventesAutre,ventesGlobal,critiqueMoyenne,nombreCritiques,
    			notesJoueurs,nombreNotesJoueurs,rating);
    	
    	manager.getTransaction().begin();
		manager.persist(jeu);
		manager.getTransaction().commit();
    	
    			
		
	}
	
	
	
	
	


}
