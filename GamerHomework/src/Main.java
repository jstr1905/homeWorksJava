import java.time.LocalDate;

import Adapter.MernisServiceAdapter;
import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer yusuf = new Gamer(20, "Yusuf", " Yýldýz", "yusuf@gmail.com", 21, "11122233344",
				LocalDate.of(2000, 8,27));
		Gamer emre = new Gamer(21, "Emre", " Aldemir", "emre@gmail.com", 17, "2121", LocalDate.of(2004, 6, 5));

		Game game1 = new Game(1, " Forza Horizon 4", "Yarýþ oyunu ", " Microsoft Studios ", "Windows ", 92);
		Game game2 = new Game(2, " Outlast", "Korku oyunu", " AbCStudios ", "Windows,Mac", 55);

		Campaign campaign1 = new Campaign(31122021, " Yýl sonu kampanyasý", 2500, 50);

		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.sign(yusuf);

		gamerManager.update(emre);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.addCampaign(game2, campaign1);

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);

	}

}
