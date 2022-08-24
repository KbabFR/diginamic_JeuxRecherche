package fr.diginamic.jeuxrecherche.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	private List<Plateforme> plateformes;

	private List<Genre> genresPreferes;

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