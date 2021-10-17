package edu.ncsu.monopoly;


public class GameBoardCCMovePlayer extends GameBoard {
    public GameBoardCCMovePlayer() {
		super();
		PropertyCell blue1 = new PropertyCell();
		PropertyCell blue2 = new PropertyCell();
		String blue01 = "Blue 1";
		String blue02 = "Blue 2";
		
        CardCell cc1 = new CardCell(Card.TYPE_CC, "Community Chest 1");
        JailCell jail = new JailCell();
        CardCell chance1 = new CardCell(Card.TYPE_CHANCE, "Chance 1");
        
        Card ccCard1 = new MovePlayerCard(blue01 , Card.TYPE_CC);
        Card ccCard2 = new MovePlayerCard(blue02, Card.TYPE_CC);
		
		blue1.setName(blue01);
		blue2.setName(blue02);
		
		blue1.setColorGroup("blue");
		blue2.setColorGroup("blue");
		
		blue1.setPrice(100);
		blue2.setPrice(100);
		
		blue1.setRent(10);
		blue2.setRent(10);
		
		blue1.setHousePrice(50);
		blue2.setHousePrice(50);
		
		addCard(ccCard1);
		addCard(ccCard2);
		
		addCell(blue1);
		addCell(cc1);
		addCell(jail);
		addCell(blue2);
		addCell(chance1);
		
    }
}
