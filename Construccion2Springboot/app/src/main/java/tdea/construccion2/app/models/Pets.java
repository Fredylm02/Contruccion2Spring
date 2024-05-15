package tdea.construccion2.app.models;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tdea.construccion2.app.dto.PetsDto;

@Entity
@Table(name="mascota")
public class Pets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private long id;
	
	
	@Column(name = "IDdueño")
    private long ownerId; // ID dueño
	
	@Column(name = "nombre")
    private String name;
	
	
	@Column(name = "edad")
    private int age;
	
	@Column(name = "especie")
    private String species;
	
	@Column(name = "raza")
    private String breed; // raza de mascota
	
	@Column(name = "caracteristicas")
    private String characteristics;
	
	@Column(name = "peso")
    private double weight;  // peso
    
	public Pets (PetsDto petsDto) {
		this.id=petsDto.getId();
		this.ownerId=petsDto.getOwnerId();
		this.name=petsDto.getName();
		this.age=petsDto.getAge();
		this.species=petsDto.getSpecies();
		this.breed=petsDto.getBreed();
		this.characteristics=petsDto.getCharacteristics();
		this.weight=petsDto.getWeight();
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
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
