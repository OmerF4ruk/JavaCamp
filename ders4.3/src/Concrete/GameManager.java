package Concrete;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService {
	
	
	public GameManager() {
		super();
		
		
	}

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" : eklendi.");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" : Güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" : Silindi.");
		
	}
}
