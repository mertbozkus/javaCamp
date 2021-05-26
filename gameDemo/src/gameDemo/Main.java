package gameDemo;

import java.rmi.RemoteException;

import gameDemo.Adapters.MernisServiceAdapter;
import gameDemo.Concrete.GameManager;
import gameDemo.Concrete.GamerManager;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;
import gameDemo.Abstract.IGamerService;
import tr.gov.nvi.tckimlik.WS.*;
import gameDemo.Entities.Sale;

public class Main {

	public static void main(String[] args) throws RemoteException {

		Campaign campaign1 = new Campaign(1, "Yeni kayit indirimi", 20);
		
		Gamer gamer1 = new Gamer(3, "Mustafa Mert", "Bozkus", 2000, 12334523);
		
		Game game1 = new Game(5, "NFS Underground", 59, 29, 30);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
	}

}
