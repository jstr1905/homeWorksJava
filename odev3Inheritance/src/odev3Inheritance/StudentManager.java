package odev3Inheritance;

public class StudentManager {

	public void sign(User student) {
		System.out.println(student.getName() + " adl� ��renci sisteme kay�t oldu");

	}

	public void login(User student) {
		System.out.println(student.getName() + " adl� ��renci sisteme giri� yapt�");

	}

	public void logout(User student) {
		System.out.println(student.getName() + " adl� ��renci sistemden ��k�� yapt�");

	}

	public void delete(User student) {
		System.out.println(student.getName() + " adl� ��renci sistemden silindi");

	}

}
