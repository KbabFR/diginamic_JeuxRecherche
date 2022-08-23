package fr.jpa;

import java.util.ArrayList;
import java.util.List;

import fr.jpa.convertisseur.Convertisseur;
import fr.jpa.model.Child;
import fr.jpa.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principale {
	
	private static EntityManagerFactory sessionFactory; 
	private static EntityManager manager;
	
	/**
	 * Etablit les outils nécessaires à la communication avec la base de données
	 */
	public static void setUp() {
		sessionFactory = Persistence.createEntityManagerFactory("my-persistence-unit"); 
		Principale.manager = sessionFactory.createEntityManager();
	}
	
	/**
	 * @return le EntityManager s'il existe
	 */
	public static EntityManager getManager()  { return manager; } 
	
	public static void main(String[] args) {
		/*
		setUp();
		
		Child enfant = new Child();
		enfant.setAge(15);
		enfant.setPrenom("Gerlain");
		
		// TODO Auto-generated method stub
		User user = new User();
		user.setMail("mail@mail.fr");
		user.setNom("Degerlain");
		user.setPrenom("Geraldine");
		user.setPass("jesuisconne");
		List<Child> liste = new ArrayList();
		liste.add(enfant);
		user.setListeEnfants(liste);
		
		
		
		manager.getTransaction().begin();
		manager.persist(user);
		manager.persist(enfant);
		manager.getTransaction().commit();*/
	}

}
