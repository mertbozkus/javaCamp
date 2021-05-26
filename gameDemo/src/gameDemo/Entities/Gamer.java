package gameDemo.Entities;

import gameDemo.Abstract.IEntity;

public class Gamer implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private long nationalityID;
	
	public Gamer(int id, String firstName, String lastName, int dateOfBirth, long nationalityID) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityID = nationalityID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public long getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(long nationalityID) {
		this.nationalityID = nationalityID;
	}

}
