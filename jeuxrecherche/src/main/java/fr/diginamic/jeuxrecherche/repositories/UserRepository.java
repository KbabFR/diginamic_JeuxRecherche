package fr.diginamic.jeuxrecherche.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.jeuxrecherche.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findById(long id);

}
