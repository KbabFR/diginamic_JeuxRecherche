package fr.diginamic.jeuxrecherche.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jeuxrecherche.models.Avis;
import fr.diginamic.jeuxrecherche.repositories.AvisRepository;

@Service
public class AvisService {

	@Autowired
	AvisRepository avisRepo;

	public Avis create(@Valid Avis avisToCreate) {
		return this.avisRepo.save(avisToCreate);
	}

	public Avis update(@Valid Avis updateAvis) {
		return this.avisRepo.save(updateAvis);
	}

	public List<Avis> findAll() {
		return this.avisRepo.findAll();
	}

	public Avis findById(long id) {
		return this.avisRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public void delete(Avis avisToDelete) {
		this.avisRepo.delete(avisToDelete);
	}
}
