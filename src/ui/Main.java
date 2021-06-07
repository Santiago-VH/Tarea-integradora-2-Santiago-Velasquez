package ui;
import java.util.Scanner;
import model.PetCenter;
import model.PetPriority;
import model.PetState;
import model.VeterinaryState;
import model.Veterinary;
import model.Species;
import model.Pet;

public class Main{

	private PetCenter petcenter; //association
	public Scanner reader= new Scanner(System.in); //scanner

	//variables
	private int vetsNumber=0;
	private int petsNumber=0;



	public Main(){
		reader= new Scanner(System.in);
	}

	public static void main(String[] args){

		System.out.println("Iniciando programa... \n");

		Main ppal=new Main();

		int option=0;

		petcenter=new PetCenter(petsNumber,vetsNumber);

		do{
			option=ppal.showMenu();
			ppal.executeOperation(option);
		}while(option!=0);

	}

	public int showMenu() {
		int option=0;

		System.out.println(
				"Porfavor seleccione una opcion.\n" +
				"(1) Agregar un veterinario\n"+
				"(2) \n" +
				"(3) Registrar mascota\n" +
				"(4) Retirar mascota\n" +
				"(0) \n"
				);
		option=reader.nextInt();
		reader.nextLine();
		return option;
	}

	public void executeOperation(int operation) {
		
	switch(operation) {
	case 0:
		System.out.println("Adios!");
		break;

	case 1:
		addVeterinary();
		break;

	case 2:

		break;

	case 3:
		addPet();
		break;

	case 4:

		break;

		default:
		System.out.println("Error, opción no valida");
		}
	}

	public void addVeterinary(){
		
		String idNumber="";
		String vetName="";
		String vetID="";

		System.out.println("Ingresar identificacion\n");
		idNumber=reader.nextLine();

		System.out.println("Ingresar nombre completo\n");
		vetName=reader.nextLine();

		System.out.println("Ingresar identificacion unica de veterinario\n");
		vetID=reader.nextLine();

		petcenter.addVeterinary(idNumber,vetName,vetID,VeterinaryState.FREE);
	}

	public void addPet(){	

		int petsNumber=0;
		String petName="";
		String symptom="";
		String race="";
		int age=0;

		Species species=Species.DOG;
		PetPriority priority=PetPriority.RED;

		System.out.println("Ingresar nombre\n");
		petName=reader.nextLine();

		System.out.println("Ingresar sintoma/s\n");
		symptom=reader.nextLine();

		System.out.println("Ingresar edad\n");
		age=reader.nextInt();
		reader.nextLine();

		System.out.println("Ingresar especie:\n DOG \n CAT\n RABBIT\n REPTILE \n BIRD");
		String specie=reader.nextLine();

			if(specie.equalsIgnoreCase("DOG")){

				species=Species.DOG;

			}else if(specie.equalsIgnoreCase("CAT")){

				species = Species.CAT;

			}else if(specie.equalsIgnoreCase("RABBIT")){

				species = Species.RABBIT;

			}else if(specie.equalsIgnoreCase("REPTILE")){

				species = Species.REPTILE;

			}else if(specie.equalsIgnoreCase("BIRD")){

				species = Species.BIRD;
			}

		System.out.println("Ingresar raza\n");
			race=reader.nextLine();

			System.out.println("Ingrese prioridad (orden de mayor a menor):\nRED\nORANGE\nYELLOW\nGREEN\nBLUE");
			String petpriority=reader.nextLine();

			if(petpriority.equalsIgnoreCase("RED")){

				priority=PetPriority.RED;
				
			}else if(petpriority.equalsIgnoreCase("ORANGE")){

				priority=PetPriority.ORANGE;
				
			}else if(petpriority.equalsIgnoreCase("YELLOW")){

				priority=PetPriority.YELLOW;

			}else if(petpriority.equalsIgnoreCase("GREEN")){

				priority=PetPriority.GREEN;

			}else if(petpriority.equalsIgnoreCase("BLUE")){
				priority=PetPriority.BLUE;
			}


			petcenter.addPet(petName,race,age,symptom,species,PetState.WAITING,priority);

	}

}

