package odev3Inheritance;

public class Instructor extends User {

	String certificates;
	String phoneNumber;

	public Instructor(int id, String name, String certificates, String phoneNumber) {

		this.setId(id);
		this.setName(name);
		this.setCertificates(certificates);
		this.setPhoneNumber(phoneNumber);

	}

	public String getCertificates() {
		return certificates;
	}

	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
