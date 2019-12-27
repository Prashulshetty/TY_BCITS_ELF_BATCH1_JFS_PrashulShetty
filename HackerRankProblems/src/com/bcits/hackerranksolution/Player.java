package com.bcits.hackerrank.datastructure;

public class Player {

	private String pname;
	private int pscore;

	public Player(String pname, int pscore) {
		super();
		this.pname = pname;
		this.pscore = pscore;
	}

	public String getPname() {
		return pname;
	}

	public int getPscore() {
		return pscore;
	}

	@Override
	public String toString() {
		return "Players \n [Playername =" + pname + "  PlayerScore = " + pscore + "]";
	}
}
