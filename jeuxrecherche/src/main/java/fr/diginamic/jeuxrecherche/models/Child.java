package fr.diginamic.jeuxrecherche.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import fr.diginamic.jeuxrecherche.enums.Genre;
import fr.diginamic.jeuxrecherche.enums.Plateforme;

@Entity
public class Child {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;

	@Column(nullable = false)
	private String prenom;

	@Column(nullable = false)
	private int age;

	// Probleme avec les @ANNOTATION de plateformes et genresPreferences
	// J'ai pu voir l'annotation @CollectionTable ? à creuser et se renseigner
	
	@Embedded
	private List<Plateforme> plateformes = new ArrayList<Plateforme>();

	@Embedded
	private List<Genre> genresPreferes = new ArrayList<Genre>();
	
	@ManyToMany
	private List<Jeu> jeuFavoris = new ArrayList<Jeu>();

	public Child() {

	}

	public Child(long id, String prenom, int age) {
		this.id = id;
		this.prenom = prenom;
		this.age = age;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the plateformes
	 */
	public List<Plateforme> getPlateformes() {
		return plateformes;
	}

	/**
	 * @param plateformes the plateformes to set
	 */
	public void setPlateformes(List<Plateforme> plateformes) {
		this.plateformes = plateformes;
	}

	/**
	 * @return the genresPreferes
	 */
	public List<Genre> getGenresPreferes() {
		return genresPreferes;
	}

	/**
	 * @param genresPreferes the genresPreferes to set
	 */
	public void setGenresPreferes(List<Genre> genresPreferes) {
		this.genresPreferes = genresPreferes;
	}

}