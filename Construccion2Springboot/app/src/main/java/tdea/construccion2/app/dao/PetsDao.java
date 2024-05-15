package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PetsDto;

public interface PetsDao {
	public  void createPets (PetsDto petsDto) throws Exception ;
	public PetsDto findOwnerPetById(PetsDto petsDto) throws Exception;
    boolean findPetsById(long petsId) throws Exception;
	
	 
}
