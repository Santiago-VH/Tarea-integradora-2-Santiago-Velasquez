package model;	

public class Pet{

	//associations
	private Species species;
	private PetState petstate;
	private PetPriority petpriority;
	private Owner owner;
	private Veterinary veterinary;

	//variables
	private String petName;
	private String petRace;
	private String petSymptoms;
	private int petAge;

	//constructor
	public Pet(String petName,String race,int age,String symptom, Species species, PetState petstate, PetPriority petpriority){
		this.petName=petName;
		this.petRace=petRace;
		this.petSymptoms=petSymptoms;
		this.petAge=petAge;
	}

	public void setSpecie(Species species){
		this.species=species;
	}

	
}