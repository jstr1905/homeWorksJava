package odev3Inheritance;

public class UserManager {

	public void sign(User user) {

		System.out.println(user.getName() + " sisteme kay�t oldu");

	}

	public void login(User user) {

		System.out.println(user.getName() + "sisteme giri� yapt�");
	}

	public void logout(User user) {

		System.out.println(user.getName() + "sistemden ��k�� yapt�");

	}

}
