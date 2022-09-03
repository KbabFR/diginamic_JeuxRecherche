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

import fr.diginamic.jeuxrecherche.models.Child;
import fr.diginamic.jeuxrecherche.services.ChildService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/rest/child")
public class ChildController {

	@Autowired
	private ChildService childService;

	@GetMapping
	public List<Child> findAll() {
		return this.childService.findAll();
	}

	@GetMapping("/{id}")
	public Child findOne(@PathVariable("id") Integer id) {
		return this.childService.findById(id);
	}

	@PostMapping
	public Child createChild(@RequestBody @Valid Child childToCreate) {
		return this.childService.create(childToCreate);
	}
	
	@PutMapping
	public Child updateChild(@RequestBody @Valid Child updateChild) {
		return this.childService.update(updateChild);
	}
	
	@DeleteMapping
	public void deleteChild(@RequestBody @Valid Child childToDelete) {
		this.childService.delete(childToDelete);
	}
}