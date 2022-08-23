package fr.diginamic.jeuxrecherche.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.jeuxrecherche.models.Jeu;

public interface JeuRepository extends JpaRepository<Jeu, Integer> {

}
