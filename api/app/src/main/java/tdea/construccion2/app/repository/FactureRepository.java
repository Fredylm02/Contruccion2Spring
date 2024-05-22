package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tdea.construccion2.app.models.Facture;

public interface FactureRepository extends JpaRepository<Facture, Integer> {

}
