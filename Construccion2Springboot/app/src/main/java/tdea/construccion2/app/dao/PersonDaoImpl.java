package tdea.construccion2.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdea.construccion2.app.dto.PersonDto;
import tdea.construccion2.app.models.Person;
import tdea.construccion2.app.repository.PersonRepository;


@Service
public class PersonDaoImpl implements PersonDao {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public void createPerson(PersonDto personDto) throws Exception {
		Person person = new Person(personDto);
		personRepository.save(person);
	}
	
	@Override
	public boolean existUserByUserName(PersonDto personDto) throws Exception {
		return personRepository.existsByUserName(personDto.getUserName());
	}

	@Override
	public PersonDto findUserByUserName(PersonDto personDto) throws Exception {
		Person person = personRepository.findByUserName(personDto.getUserName());
		if(person == null) {
			return null;
		}
		return new PersonDto(person);
	}

	@Override
	public boolean findUserExist(long personId) throws Exception {
		return personRepository.existsById(personId);
	}

	@Override
	public PersonDto findUserById(PersonDto personDto) throws Exception {
		Person person = personRepository.findPersonById(personDto.getId());
		if (person == null) {
			return null;
		}
		return new PersonDto(person);
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}

	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

}
