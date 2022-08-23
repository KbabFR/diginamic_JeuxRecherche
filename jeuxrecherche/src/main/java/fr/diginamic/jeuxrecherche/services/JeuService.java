package fr.diginamic.jeuxrecherche.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jeuxrecherche.models.Jeu;
import fr.diginamic.jeuxrecherche.repositories.JeuRepository;

@Service
public class JeuService {

	@Autowired
	JeuRepository jeuRepo;

	public Jeu create(@Valid Jeu jeuToCreate) {
		return this.jeuRepo.save(jeuToCreate);
	}

	public Jeu update(@Valid Jeu updateJeu) {
		return this.jeuRepo.save(updateJeu);
	}

	public List<Jeu> findAll() {
		return this.jeuRepo.findAll();
	}

	public Jeu findById(Integer id) {
		return this.jeuRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public void delete(Jeu jeuToDelete) {
		this.jeuRepo.delete(jeuToDelete);
	}
}
