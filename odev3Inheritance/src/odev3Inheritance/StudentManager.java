package odev3Inheritance;

public class StudentManager {

	public void sign(User student) {
		System.out.println(student.getName() + " adlı öğrenci sisteme kayıt oldu");

	}

	public void login(User student) {
		System.out.println(student.getName() + " adlı öğrenci sisteme giriş yaptı");

	}

	public void logout(User student) {
		System.out.println(student.getName() + " adlı öğrenci sistemden çıkış yaptı");

	}

	public void delete(User student) {
		System.out.println(student.getName() + " adlı öğrenci sistemden silindi");

	}

}
