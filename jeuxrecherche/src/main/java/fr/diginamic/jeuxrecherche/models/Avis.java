package fr.diginamic.jeuxrecherche.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private long id;

	private User user;
	private Jeu jeu;

	private String contenu;

	@Column(nullable = false)
	private float note;

	public Avis() {

	}

	public Avis(long id, User user, Jeu jeu, String contenu, float note) {
		super();
		this.id = id;
		this.user = user;
		this.jeu = jeu;
		this.contenu = contenu;
		this.note = note;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the jeu
	 */
	public Jeu getJeu() {
		return jeu;
	}

	/**
	 * @param jeu the jeu to set
	 */
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}

	/**
	 * @return the contenu
	 */
	public String getContenu() {
		return contenu;
	}

	/**
	 * @param contenu the contenu to set
	 */
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	/**
	 * @return the note
	 */
	public float getNote() {
		return note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(float note) {
		this.note = note;
	}

}