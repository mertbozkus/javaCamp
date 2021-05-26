package gameDemo.Entities;

import gameDemo.Abstract.IEntity;

public class Sale implements IEntity{
	
	private int id;
	private String gameName;
	private String gamerName;

	public Sale(int id, String gameName, String gamerName) {
		this.id = id;
		this.gameName = gameName;
		this.gamerName = gamerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}
	
}
