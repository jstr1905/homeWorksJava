
public class Main {

	public static void main(String[] args) {

		int number = 6;
		int tut = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				tut = tut + i;
			}
			if (number == tut) {
				System.out.println("Girilen say� m�kemmel say�d�r !");
				System.out.println("Girilen say� m�kemmel say� de�ildir !");
			}

		}
	}
}
