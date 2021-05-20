package Abstract;

import Entities.Game;

public class GameManager implements GameService
{

	@Override
	public void add(Game game) 
	{
		
		System.out.println("Oyun Eklendi " + game.getGameId());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi " + game.getGameId());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi " + game.getGameId());
		
	}
	
}
