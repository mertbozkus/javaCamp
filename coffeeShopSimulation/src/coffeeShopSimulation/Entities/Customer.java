package coffeeShopSimulation.Entities;

import coffeeShopSimulation.Abstract.IEntity;

public class Customer implements IEntity {
	
	private int id;
	private String FirstName;
	private String LastName;
	private String DateOfBirth;
	String NationalityId;
	
	public  Customer() {
		
	}

	public Customer(int id, String FirstName, String LastName, String DateOfBirth, String NationalityId) {
		super();
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.DateOfBirth = DateOfBirth;
		this.NationalityId = NationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
}
