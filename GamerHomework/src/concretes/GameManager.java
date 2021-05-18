package concretes;

import abstracts.GameService;
import entities.Campaign;
import entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Yeni oyun eklendi : " + game.getId() + game.getName() + game.getDeveloper()
				+ game.getUnitPrice() + "TL");

	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun bilgileri güncellendi : " + game.getId() + game.getName() + game.getDeveloper()
				+ game.getUnitPrice() + "TL");

	}

	@Override
	public void delete(Game game) {
		System.out.println(
				"Oyun silindi : " + game.getId() + game.getName() + game.getDeveloper() + game.getUnitPrice() + "TL");

	}

	@Override
	public void addCampaign(Game game, Campaign campaign) {
		
		double newPrice = game.getUnitPrice() * campaign.getCampaignDiscount() /100;
        game.setUnitPrice(newPrice);

        System.out.println("Yeni ürün fiyatý = " + game.getUnitPrice()+" TL");
	}

}
