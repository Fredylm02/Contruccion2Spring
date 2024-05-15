package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PetsDto;
import tdea.construccion2.app.models.Pets;
import tdea.construccion2.app.repository.PetsRepository;

@Service
public class PetsDaolmpl implements PetsDao {
    
	@Autowired
	private PetsRepository petsRepository;
	
	@Override
	public void createPets(PetsDto petsDto) throws Exception {
		petsRepository.save(new Pets(petsDto));
	}
	
	@Override
	public boolean findPetsById(long petsId) throws Exception {
		return petsRepository.existsById(petsId);
		
	}
    	
	@Override
	public PetsDto findOwnerPetById(PetsDto petsDto) throws Exception {
		Pets pets = petsRepository.findById(petsDto.getId());
		if (pets == null) {
			return null;
		}
		return new PetsDto(pets);
	}
	
	public PetsRepository getPetsRepository() {
		return petsRepository;
	}

	public void setPetsRepository(PetsRepository petsRepository) {
		this.petsRepository = petsRepository;
	}



	

	
}
