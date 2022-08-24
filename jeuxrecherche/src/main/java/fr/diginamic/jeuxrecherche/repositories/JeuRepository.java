package fr.diginamic.jeuxrecherche.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.jeuxrecherche.enums.Genre;
import fr.diginamic.jeuxrecherche.enums.Rating;
import fr.diginamic.jeuxrecherche.models.Jeu;

public interface JeuRepository extends JpaRepository<Jeu, Integer> {

	List<Jeu> findByRating (Rating rating);
	
	List<Jeu> findByGenre (Genre genre);
	
		
	
	
}
