package fr.jpa.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;
	
	@Column(nullable = false)
	private String prenom;

	@Column(nullable = false)
	private String nom;
	

	@Column(nullable = false)
	private String mail;
	

	@Column(nullable = false)
	private String pass;
	
	private List<Child> listeEnfants;
	//TODO la méthode d'ajout d'enfant à cette liste
	
	public User() {
		
	}
	
	public User(long id, String prenom, String nom, String mail, String pass) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.mail = mail;
		this.pass = pass;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the listeEnfants
	 */
	public List<Child> getListeEnfants() {
		return listeEnfants;
	}

	/**
	 * @param listeEnfants the listeEnfants to set
	 */
	public void setListeEnfants(List<Child> listeEnfants) {
		this.listeEnfants = listeEnfants;
	}

}
