
public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 3, 5, 7, 8 };

		int aranacak = 99;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}

		}
		if (varMi) {
			System.out.println("Say� mevcuttur");

		} else
			System.out.println("Say� mevcut de�ildir");

	}

}
