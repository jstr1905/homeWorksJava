package concretes;

import abstracts.GamerCheckService;
import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService {
	private GamerCheckService gamerCheckService;

	public GamerManager(GamerCheckService gamerCheckService) {

		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void sign(Gamer gamer) {
		if (gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Yeni oyuncu eklendi : " + gamer.getFirstName() + " " + gamer.getLastName());
		} else {
			System.out.println("Ge�ersiz ki�i");
		}

	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " sisteme giri� yapt�");

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " bilgilerini g�ncelledi");

	}

	@Override
	public void logout(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " sistemden ��k�� yapt�");

	}

}
