package odev3Inheritance;

public class InstructorManager {

	public void sign(User instructor) {
		System.out.println(instructor.getName() + " adl� e�itmen sisteme kay�t oldu");

	}

	public void login(User instructor) {

		System.out.println(instructor.getName() + " adl� e�itmen sisteme giri� ");

	}

	public void logout(User instructor) {
		System.out.println(instructor.getName() + " adl� e�itmen sistemden ��k�� yapt�");

	}

	public void update(User instructor) {
		System.out.println(instructor.getName() + " adl� e�itmenin bilgileri g�ncelllendi ");

	}
}
