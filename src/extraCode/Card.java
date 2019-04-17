package extraCode;
//Jonathan Robertson
//in-class exercise

import java.util.Random;

public class Card {
	private String suit;
	private int number;
	
	public String getSuit() {
		return suit;
		
	}
	public int getNumber() {
		return number;
	
	}
	
	public void setSuit(String suitToBeSet) {
		suit = suitToBeSet;
		
	}
	public void draw() {
		Random randomGen = new Random(); //random generator
		
		//suit = "Diamonds";//random suit
		//number = 4;
		int suitNum = Math.abs(randomGen.nextInt() %4);
		if (suitNum ==0) {
			suit = "Diamonds";
		} else if (suitNum == 1) {
			
		}
		
	}
}
