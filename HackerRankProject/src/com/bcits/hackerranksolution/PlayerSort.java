package com.bcits.hackerrank.datastructure;

import java.util.Comparator;

public class PlayerSort implements Comparator<Player> {

	@Override
	public int compare(Player p1, Player p2) {
		if (p1.getPscore() == p2.getPscore()) {
			return p1.getPname().compareTo(p2.getPname());
		}
		return p2.getPscore() - p1.getPscore();
	}

}