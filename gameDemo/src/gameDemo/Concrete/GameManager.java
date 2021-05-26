package gameDemo.Concrete;

import gameDemo.Abstract.IGameService;
import gameDemo.Entities.Game;

public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " oyunu guncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " oyunu silindi.");
		
	}

}
