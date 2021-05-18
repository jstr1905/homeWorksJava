package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {

		System.out.println("Kampanya sisteme eklendi : "  + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi : "  + campaign.getName());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silindi : "  + campaign.getName());

	}

}
