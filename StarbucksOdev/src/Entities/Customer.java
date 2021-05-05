package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity {
	int id;
	String firstName;
	String lastName;
	String nationalId;
	LocalDate dateofBirth;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, String nationalId, LocalDate dateofBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateofBirth = dateofBirth;
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

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public LocalDate getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

}
