package model;

public class PetCenter{

	//Array associations
	private Veterinary[] veterinaries;
	private Pet[] pet;

	//variables
	private int petsNumber=0;
	private int vetsNumber=0;
	private int petsPosition=0;
	private int vetsPosition=0;

	//Global variables
	public final int MAX_VETERINARIES=7;
	public final int MAX_PETS=120;

	//constructor
	public PetCenter(int petNumber,int vetNumber){
		this.petsNumber=petNumber;
		this.vetsNumber=vetNumber;

		veterinaries = new Veterinary[MAX_VETERINARIES];
		pet = new Pet[MAX_PETS];
	}



	public void addPet(String petName,String race,int age,String symptom, Species species, PetState petstate, PetPriority petpriority){
		pet[petsNumber]=new Pet(petName,race,age,symptom,species,petstate,petpriority);
		petsNumber++;
		petsPosition=petsNumber;
	}

	public void addVeterinary(String idNumber,String vetName,String vetID,VeterinaryState veterinaryState){
		veterinaries[vetsNumber]=new Veterinary(idNumber,vetName,vetID,veterinaryState);
		vetsNumber++;
		vetsPosition=vetsNumber;
		
	}

	public int getPetsNumber(){
		return petsNumber;
	}

	public int getVetsNumber(){
		return vetsNumber;
	}

}