package fr.diginamic.jeuxrecherche.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fr.diginamic.jeuxrecherche.enums.Genre;
import fr.diginamic.jeuxrecherche.enums.Plateforme;
import fr.diginamic.jeuxrecherche.enums.Rating;

@Entity
public class Jeu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer id;

	@Column(nullable = false)
	private String nom;

	@Column(nullable = false)
	private Plateforme plateforme;

	private int anneeDeSortie;

	@Column(nullable = false)
	private Genre genre;

	@Column(nullable = false)
	private String editeur;

	private double ventesNA;
	private double ventesEU;
	private double ventesJP;
	private double ventesAutre;
	private double ventesGlobal;
	private float critiqueMoyenne;
	private double nombreCritiques;
	private float notesJoueurs;
	private double nombreNotesJoueurs;

	@Column(nullable = false)
	private Rating rating;

	@OneToMany(mappedBy = "jeu")
	private List<Avis> avis = new ArrayList<Avis>();
	
	public Jeu(String nom, Plateforme plateforme, int anneeDeSortie, Genre genre, String editeur, double ventesNA,
			double ventesEU, double ventesJP, double ventesAutre, double ventesGlobal, float critiqueMoyenne,
			double nombreCritiques, float notesJoueurs, double nombreNotesJoueurs, Rating rating) {
		this.nom = nom;
		this.plateforme = plateforme;
		this.anneeDeSortie = anneeDeSortie;
		this.genre = genre;
		this.editeur = editeur;
		this.ventesNA = ventesNA;
		this.ventesEU = ventesEU;
		this.ventesJP = ventesJP;
		this.ventesAutre = ventesAutre;
		this.ventesGlobal = ventesGlobal;
		this.critiqueMoyenne = critiqueMoyenne;
		this.nombreCritiques = nombreCritiques;
		this.notesJoueurs = notesJoueurs;
		this.nombreNotesJoueurs = nombreNotesJoueurs;
		this.rating = rating;

	}

	/**
	 * Constructeur vide nécessaire pour JPA
	 */
	public Jeu() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the plateforme
	 */
	public Plateforme getPlateforme() {
		return plateforme;
	}

	/**
	 * @param plateforme the plateforme to set
	 */
	public void setPlateforme(Plateforme plateforme) {
		this.plateforme = plateforme;
	}

	/**
	 * @return the anneeDeSortie
	 */
	public int getAnneeDeSortie() {
		return anneeDeSortie;
	}

	/**
	 * @param anneeDeSortie the anneeDeSortie to set
	 */
	public void setAnneeDeSortie(int anneeDeSortie) {
		this.anneeDeSortie = anneeDeSortie;
	}

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	/**
	 * @return the editeur
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @param editeur the editeur to set
	 */
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	/**
	 * @return the ventesNA
	 */
	public double getVentesNA() {
		return ventesNA;
	}

	/**
	 * @param ventesNA the ventesNA to set
	 */
	public void setVentesNA(double ventesNA) {
		this.ventesNA = ventesNA;
	}

	/**
	 * @return the ventesEU
	 */
	public double getVentesEU() {
		return ventesEU;
	}

	/**
	 * @param ventesEU the ventesEU to set
	 */
	public void setVentesEU(double ventesEU) {
		this.ventesEU = ventesEU;
	}

	/**
	 * @return the ventesJP
	 */
	public double getVentesJP() {
		return ventesJP;
	}

	/**
	 * @param ventesJP the ventesJP to set
	 */
	public void setVentesJP(double ventesJP) {
		this.ventesJP = ventesJP;
	}

	/**
	 * @return the ventesAutre
	 */
	public double getVentesAutre() {
		return ventesAutre;
	}

	/**
	 * @param ventesAutre the ventesAutre to set
	 */
	public void setVentesAutre(double ventesAutre) {
		this.ventesAutre = ventesAutre;
	}

	/**
	 * @return the ventesGlobal
	 */
	public double getVentesGlobal() {
		return ventesGlobal;
	}

	/**
	 * @param ventesGlobal the ventesGlobal to set
	 */
	public void setVentesGlobal(double ventesGlobal) {
		this.ventesGlobal = ventesGlobal;
	}

	/**
	 * @return the critiqueMoyenne
	 */
	public float getCritiqueMoyenne() {
		return critiqueMoyenne;
	}

	/**
	 * @param critiqueMoyenne the critiqueMoyenne to set
	 */
	public void setCritiqueMoyenne(float critiqueMoyenne) {
		this.critiqueMoyenne = critiqueMoyenne;
	}

	/**
	 * @return the nombreCritiques
	 */
	public double getNombreCritiques() {
		return nombreCritiques;
	}

	/**
	 * @param nombreCritiques the nombreCritiques to set
	 */
	public void setNombreCritiques(double nombreCritiques) {
		this.nombreCritiques = nombreCritiques;
	}

	/**
	 * @return the notesJoueurs
	 */
	public float getNotesJoueurs() {
		return notesJoueurs;
	}

	/**
	 * @param notesJoueurs the notesJoueurs to set
	 */
	public void setNotesJoueurs(float notesJoueurs) {
		this.notesJoueurs = notesJoueurs;
	}

	/**
	 * @return the nombreNotesJoueurs
	 */
	public double getNombreNotesJoueurs() {
		return nombreNotesJoueurs;
	}

	/**
	 * @param nombreNotesJoueurs the nombreNotesJoueurs to set
	 */
	public void setNombreNotesJoueurs(double nombreNotesJoueurs) {
		this.nombreNotesJoueurs = nombreNotesJoueurs;
	}

	/**
	 * @return the rating
	 */
	public Rating getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(Rating rating) {
		this.rating = rating;
	}

}