package abstracts;

import entities.Campaign;
import entities.Game;

public interface GameService {
	public void add(Game game);

	public void update(Game game);

	public void delete(Game game);
	
	public void addCampaign(Game game,Campaign campaign);

}
