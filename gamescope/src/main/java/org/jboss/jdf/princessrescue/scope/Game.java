package org.jboss.jdf.princessrescue.scope;

import java.util.LinkedList;
import java.util.List;

import org.jboss.jdf.princessrescue.Player;

public class Game {
	private int id;
	
	private List<Player> players = new LinkedList<Player> ();

	public List<Player> getPlayers() {
		return players;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
