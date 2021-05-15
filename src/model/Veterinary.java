package model;

public class Veterinary{

	//associations
	private VeterinaryState veterinarystate;


	//variables
	private String idNumber;
	private String vetName;
	private String vetID;

	//constructor
	public Veterinary(String idNumber,String vetName,String vetID,VeterinaryState veterinaryState){
		this.idNumber=idNumber;
		this.vetName=vetName;
		this.vetID=vetID;
	}

	public String getidNumber(){
		return idNumber;
	}

	public String getvetName(){
		return vetName;
	}

	public String getvetID(){
		return vetID;
	}
}