package fr.diginamic.jeuxrecherche.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.jeuxrecherche.models.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Integer>{

	Optional<Avis> findById(long id);

}
