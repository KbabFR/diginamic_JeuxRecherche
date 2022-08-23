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

import fr.diginamic.jeuxrecherche.models.User;
import fr.diginamic.jeuxrecherche.services.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> findAll() {
		return this.userService.findAll();
	}

	@GetMapping("/{id}")
	public User findOne(@PathVariable("id") Integer id) {
		return this.userService.findById(id);
	}

	@PostMapping
	public User createUser(@RequestBody @Valid User userToCreate) {
		return this.userService.create(userToCreate);
	}

	@PutMapping
	public User updateUser(@RequestBody @Valid User updateUser) {
		return this.userService.update(updateUser);
	}

	@DeleteMapping
	public void deleteUser(@RequestBody @Valid User userToDelete) {
		this.userService.delete(userToDelete);
	}
}