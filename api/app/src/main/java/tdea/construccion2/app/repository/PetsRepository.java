package tdea.construccion2.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import tdea.construccion2.app.models.Pets;

public interface PetsRepository  extends JpaRepository<Pets, Integer>{
	public Pets findById(long id);
	public boolean existsById(long id);
}
