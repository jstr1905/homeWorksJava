
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 3, 5, 7, 8 };

		int aranacak = 99;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;

			}

		}

		String mesaj = " ";
		if (varMi) {
			mesaj = "Say� mevcuttur:" + aranacak;
			mesajVer(mesaj);

		} else {
			mesajVer("Say� mevcut de�ildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
