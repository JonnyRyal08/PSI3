package extraCode;

import java.util.Random;
/**
 * @author jrobertson08
 *
 */
public class Card { 
	private String suit;
	private int number;
	
	/**
	 * @return
	 */
	public String getSuit() {
		return suit;
	}
	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * @param suitToBeSet
	 */
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
