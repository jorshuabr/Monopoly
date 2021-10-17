package edu.ncsu.monopoly;

public abstract class Cell {
	private boolean available = true;
	private String name;
	protected Player owner;
	static final int valorZeo = 0;

	public String getName() {
		return name;
	}

	public Player getOwner() {
		return owner;
	}
	
	public double getPrice() {
		return valorZeo;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public abstract void playAction();

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	void setName(String name) {
		this.name = name;
	}

	public void setOwner(Player owner) {
		this.owner = owner;
	}
    
    public String toString() {
        return name;
    }
}
