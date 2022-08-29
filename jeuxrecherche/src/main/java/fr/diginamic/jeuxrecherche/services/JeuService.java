package fr.diginamic.jeuxrecherche.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jeuxrecherche.enums.Rating;
import fr.diginamic.jeuxrecherche.models.Child;
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

	public List<Jeu> filterByAge(Child child) {
		List<Jeu> listByRating = jeuRepo.findByRating(Rating.EC);
		if (child.getAge() >= 18)
			listByRating.addAll(jeuRepo.findByRating(Rating.M));
		if (child.getAge() >= 16)
			listByRating.addAll(jeuRepo.findByRating(Rating.T));
		if (child.getAge() >= 12)
			listByRating.addAll(jeuRepo.findByRating(Rating.E10));
		if (child.getAge() >= 7)
			listByRating.addAll(jeuRepo.findByRating(Rating.E));
		return listByRating;
	}

	public List<Jeu> filterByAgeConsoleAndGenre(Child child) {
		List<Jeu> listByAge = filterByAge(child);
		if (child.getGenresPreferes().isEmpty() && child.getPlateformes().isEmpty())
			return listByAge;
		else {
			List<Jeu> listJeu = new ArrayList<Jeu>();
			if (child.getPlateformes().isEmpty()) {
				for (Jeu jeu : listByAge) {
					if (child.getGenresPreferes().contains(jeu.getGenre()))
						listJeu.add(jeu);
				}
				return listJeu;
			} else if (child.getGenresPreferes().isEmpty()) {
				for (Jeu jeu : listByAge) {
					if (child.getPlateformes().contains(jeu.getPlateforme()))
						listJeu.add(jeu);
				}
				return listJeu;
			} else {
				for (Jeu jeu : listByAge) {
					if (child.getPlateformes().contains(jeu.getPlateforme())
							&& child.getGenresPreferes().contains(jeu.getGenre()))
						listJeu.add(jeu);
				}
				return listJeu;
			}

		}

	}
	
	public List<Jeu> sortByAmountOfReviewsAndAverage(Child child) {
		
		List<Jeu> list = filterByAgeConsoleAndGenre(child);
		list.sort(null);
		
		return list;
	}
	
	

}
