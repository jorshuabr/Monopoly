package edu.ncsu.monopoly;

import java.util.Random;

public class Die {
	public int getRoll() {
		//return (int)(Math.random() * 6) + 1;
		Random r = new Random();
		return r.nextInt(6) +1;
	}
}
