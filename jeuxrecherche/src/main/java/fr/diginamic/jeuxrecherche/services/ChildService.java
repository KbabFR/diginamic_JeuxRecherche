package fr.diginamic.jeuxrecherche.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jeuxrecherche.models.Child;
import fr.diginamic.jeuxrecherche.repositories.ChildRepository;

@Service
public class ChildService {

	@Autowired
	ChildRepository childRepo;

	public Child create(@Valid Child childToCreate) {
		return this.childRepo.save(childToCreate);
	}

	public Child update(@Valid Child updateChild) {
		return this.childRepo.save(updateChild);
	}

	public List<Child> findAll() {
		return this.childRepo.findAll();
	}

	public Child findById(long id) {
		return this.childRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public void delete(Child childToDelete) {
		this.childRepo.delete(childToDelete);
	}
}