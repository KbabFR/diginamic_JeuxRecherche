package fr.jpa.utils;

import fr.jpa.model.Jeu;

import java.io.IOException;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

public class CoverImageGetter {

	public static void main(String[] args) throws IOException {
		/*
		 Jeu jeu = new Jeu();
		
		jeu.setAnneeDeSortie(1998);
		jeu.setNom("NFL Blitz 2000");
		jeu.setPlateforme("PS");
		
		System.out.println(getCoverImage(jeu));*/
	}
	
	/**
	 * Remplace, dans une chaine, les espaces par %20, par exemple
	 * World Series of Poker 2008: Battle for the Bracelets 
	 * deviendra
	 * World%20Series%20of%20Poker%202008%3A%20Battle%20for%20the%20Bracelets
	 * @param nomInitial la chaine a modifier
	 * @return la chaine modifiee
	 */
	public static String getNomTransforme(String nomInitial) {
		nomInitial = nomInitial.replace(" ","%20");
		return nomInitial;
	}

	/**
	 * pour un jeu donne, sur une plateforme donnee, sortie en l'annee donnee, renvoie une chaine 
	 * contenant le nom, la plateforme, l'annee, et le mot coverart
	 * @param nomJeu Le nom du jeu 
	 * @param plateforme la plateforme 
	 * @param annee l'annee de sortie du jeu
	 * @return la chaine contenant l'intitulle de la requete
	 */
	public static String getRequete(String nomJeu, String plateforme, String annee) {
		return nomJeu + " " + plateforme + " " + annee + " coverart" ;
	}


	/**
	 * @param jeu Le jeu (de la classe fr.jpa.model.Jeu) dont on doit trouver une image de couverture
	 * @return l'url de l'image de couverture pour le jeu
	 * @throws IOException
	 */
	public static String getCoverImage(Jeu jeu) throws IOException {

		// on crée un string pour la requête ) effectuer
		String requete = getNomTransforme("https://bing-image-search1.p.rapidapi.com/images/search?q="+getRequete(jeu.getNom(),jeu.getPlateforme(),String.valueOf(jeu.getAnneeDeSortie())) + "&count=1");
		System.out.println(requete);
		// on crée le client pour l'API 
		OkHttpClient client = new OkHttpClient();
		
		// on crée la requête HTML
		Request request = new Request.Builder()
			.url(requete)
			.get()
			.addHeader("X-RapidAPI-Key", "d8754e868dmsh03ee23c6d8bfa8dp18bcf3jsn156e8ffe8e2c")
			.addHeader("X-RapidAPI-Host", "bing-image-search1.p.rapidapi.com")
			.build();

		// on l'exécute
		ResponseBody reponse = client.newCall(request).execute().body();
		
		// on transforme le résultat en String
		String stringReponse = reponse.string();
		reponse.close();
		
		// on split le String
		String[] splitage = stringReponse.split("\"");
		
		// on cherche l'url de l'image
		String url = "";
		for(int i = 0; i < splitage.length; i++) {
			String el = splitage[i];
			if(el.equals("contentUrl")) {
				url = splitage[i+2];
				i = splitage.length;
			}
		}
		
		// et on le renvoie. 
		url = url.replace("http://","");
		url = url.replace("https://","");
		url = url.replace("\\/","/");
		return url;
	}
}
