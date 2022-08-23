package fr.diginamic.jeuxrecherche.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.jeuxrecherche.models.Jeu;
import fr.diginamic.jeuxrecherche.services.JeuService;

@RestController
@RequestMapping("/rest/jeu")
public class JeuController {

	@Autowired
	private JeuService jeuService;

	@GetMapping
	public List<Jeu> findAll() {
		return this.jeuService.findAll();
	}

	@GetMapping("/{id}")
	public Jeu findOne(@PathVariable("id") Integer id) {
		return this.jeuService.findById(id);
	}

	@PostMapping
	public Jeu createJeu(@RequestBody @Valid Jeu jeuToCreate) {
		return this.jeuService.create(jeuToCreate);
	}

	@PutMapping
	public Jeu updateJeu(@RequestBody @Valid Jeu updateJeu) {
		return this.jeuService.update(updateJeu);
	}

	@DeleteMapping
	public void deleteJeu(@RequestBody @Valid Jeu jeuToDelete) {
		this.jeuService.delete(jeuToDelete);
	}
}