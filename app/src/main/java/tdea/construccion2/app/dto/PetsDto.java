package tdea.construccion2.app.dto;

import tdea.construccion2.app.models.Pets;

public class PetsDto {
    private long idPets;
    private String name;
    private long ownerId; // ID dueño
    private int age;
    private String species;
    private String breed; // raza de mascota
    private String characteristics;
    private double weight;  // peso
    
	public PetsDto( String name , long ownerId, int age, String species, String breed,
		String characteristics, double weight) {
		super();
		this.name = name;
		this.ownerId = ownerId;
		this.age = age;
		this.species = species;
		this.breed = breed;
		this.characteristics = characteristics;
		this.weight = weight;
	}
	
    public PetsDto(Pets pets) {
    	this.idPets = pets.getId();
    	this.ownerId = pets.getOwnerId();
    	this.name = pets.getName();
    	this.age = pets.getAge();
    	this.species = pets.getSpecies();
    	this.breed = pets.getBreed();
    	this.characteristics = pets.getCharacteristics();
    	this.weight = pets.getWeight();
    	}
    

    public PetsDto() {}


	public PetsDto(Long idPets) {
		this.idPets = idPets;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return idPets;
	}
	public void setId(long id) {
		this.idPets = id;
	}
	public String 
	getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
    
    
}
