package tdea.construccion2.app.dao;

import tdea.construccion2.app.dto.PersonDto;

public interface PersonDao {
	public void createPerson(PersonDto personDto) throws Exception;
	
	public boolean findUserExist(long personId)throws Exception;
	
	public PersonDto findUserById(PersonDto personDto) throws Exception;
	
	public boolean existUserByUserName(PersonDto personDto) throws Exception;
	
	public PersonDto findUserByUserName(PersonDto personDto) throws Exception;
}
