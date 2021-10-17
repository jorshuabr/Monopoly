package edu.ncsu.monopoly;

public class RailRoadCell extends Cell {
	static private int baseRent;
	static public String COLOR_GROUP = "RAILROAD";
	static private double price;

	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	public static void setPrice(double price) {
		RailRoadCell.price = price;
	}
	
	public double getPrice() {
		return RailRoadCell.price;
	}

	public double getRent() {
		return (double) (RailRoadCell.baseRent * (double)Math.pow(2, owner.numberOfRR() - 1));
	}
	
	public void playAction() {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(owner != currentPlayer) {
				currentPlayer.payRentTo(owner, getRent());
			}
		}
	}
}
