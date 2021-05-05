package odev3Inheritance;

public class UserManager {

	public void sign(User user) {

		System.out.println(user.getName() + " sisteme kayýt oldu");

	}

	public void login(User user) {

		System.out.println(user.getName() + "sisteme giriþ yaptý");
	}

	public void logout(User user) {

		System.out.println(user.getName() + "sistemden çýkýþ yaptý");

	}

}
