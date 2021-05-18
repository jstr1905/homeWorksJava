package abstracts;

import entities.Gamer;

public interface GamerService {
	public void sign(Gamer gamer);

	public void login(Gamer gamer);

	public void update(Gamer gamer);

	public void logout(Gamer gamer);

}
