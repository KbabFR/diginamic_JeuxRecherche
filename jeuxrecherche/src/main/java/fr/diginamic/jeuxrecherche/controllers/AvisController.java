package fr.diginamic.jeuxrecherche.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.jeuxrecherche.models.Avis;
import fr.diginamic.jeuxrecherche.services.AvisService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/rest/avis")
public class AvisController {

	@Autowired
	private AvisService avisService;

	@GetMapping
	public List<Avis> findAll() {
		return this.avisService.findAll();
	}

	@GetMapping("/{id}")
	public Avis findOne(@PathVariable("id") Integer id) {
		return this.avisService.findById(id);
	}

	@PostMapping
	public Avis createAvis(@RequestBody @Valid Avis avisToCreate) {
		return this.avisService.create(avisToCreate);
	}

	@PutMapping
	public Avis updateAvis(@RequestBody @Valid Avis updateAvis) {
		return this.avisService.update(updateAvis);
	}

	@DeleteMapping
	public void deleteAvis(@RequestBody @Valid Avis avisToDelete) {
		this.avisService.delete(avisToDelete);
	}
}
