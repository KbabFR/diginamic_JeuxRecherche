package fr.diginamic.jeuxrecherche.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.jeuxrecherche.models.Child;

public interface ChildRepository extends JpaRepository<Child, Integer> {

	Optional<Child> findById(long id);

}
