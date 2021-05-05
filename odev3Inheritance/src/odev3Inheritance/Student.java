package odev3Inheritance;

public class Student extends User {

	private String email;

	public Student(int id, String name, String email) {

		this.setId(id);
		this.setName(name);
		this.setEmail(email);

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
