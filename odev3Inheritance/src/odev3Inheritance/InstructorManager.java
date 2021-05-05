package odev3Inheritance;

public class InstructorManager {

	public void sign(User instructor) {
		System.out.println(instructor.getName() + " adlý eðitmen sisteme kayýt oldu");

	}

	public void login(User instructor) {

		System.out.println(instructor.getName() + " adlý eðitmen sisteme giriþ ");

	}

	public void logout(User instructor) {
		System.out.println(instructor.getName() + " adlý eðitmen sistemden çýkýþ yaptý");

	}

	public void update(User instructor) {
		System.out.println(instructor.getName() + " adlý eðitmenin bilgileri güncelllendi ");

	}
}
