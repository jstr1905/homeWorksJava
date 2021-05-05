
public class Main {

	public static void main(String[] args) {
		int sayi1 = 17296;
		int sayi2 = 18416;
		int tut1 = 0;
		int tut2 = 0;

		for (int i = 1; i < sayi1; i++) {

			if (sayi1 % i == 0) {
				tut1 = tut1 + i;
			}
		}

		for (int j = 1; j < sayi2; j++) {

			if (sayi2 % j == 0) {
				tut2 = tut2 + j;
			}

		}

		if (tut1 == sayi2 && tut2 == sayi1) {

			System.out.println("Sayılar arkadaş sayıdır");
		} else {

			System.out.println("Sayılar arkadaş değildir");
		}

	}
}