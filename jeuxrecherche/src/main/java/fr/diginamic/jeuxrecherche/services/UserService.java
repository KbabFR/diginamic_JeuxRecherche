package fr.diginamic.jeuxrecherche.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.jeuxrecherche.models.User;
import fr.diginamic.jeuxrecherche.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;

	public User create(@Valid User userToCreate) {
		return this.userRepo.save(userToCreate);
	}

	public User update(@Valid User updateUser) {
		return this.userRepo.save(updateUser);
	}

	public List<User> findAll() {
		return this.userRepo.findAll();
	}

	public User findById(long id) {
		return this.userRepo.findById(id).orElseThrow(EntityNotFoundException::new);
	}

	public void delete(User userToDelete) {
		this.userRepo.delete(userToDelete);
	}
}
