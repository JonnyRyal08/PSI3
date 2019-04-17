//Jonathan Robertson
//Restaurant In-N-Out 
//PSI3 updated version
//need to create other restaurants
import java.util.ArrayList;
import java.util.Scanner;



public class InNOut {
	public static void main(String[] args) {
		Menu menu = new Menu();
		ArrayList<Item> order = new ArrayList<Item>();
		Item burger = new Item("Hamburber", "Burger", 2.10, "Single");
		//finish menu in main.
		Merchandise teeShirt = new Merchandise("TeeShirt", "Merchandise", 15.99, "Large", "male");
		order.add(burger);
		order.add(teeShirt); //polymorphism by adding merchandise which extends Item
		
		
//		// gets number of burgers in menu
//		int burgerSize = menu.getBurgersSize();
//		System.out.println("Burgers:\t" + burgerSize);

//		int frySize = menu.getFriesSize();
//		System.out.println("Burgers:\t" + frySize);
//		
		System.out.println("Hello, welcome to In-N-Out!");
		String userName;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = in.nextLine();
		
		// print out greeting using escape methods
		System.out.println("Hello " + name + "," + "\n" + "Please take a look at our menu. ");

		
		// prints a list of burgers
		System.out.println(menu.getAllBurgers());
		System.out.println(menu.getAllFries());
		System.out.println(menu.getAllDrinks());
		System.out.println(menu.getAllShakes());
		//System.out.println(menu.getAllSecrets());
		System.out.println();
		
		// prints an item in menu
		// System.out.println(burger1);
		// System.out.println(burger2);

		int menuSelection; 
		
		System.out.println("Would you like to order?");
		String input = in.nextLine();
		
		switch(input) {
		case"Yes":
			System.out.println("Good choice, I do believe you are going to enjoy your meal.");;
			System.out.println("What will you be having today?");
			break;
			
		case"No":
			System.out.println("I'm sorry you don't want to eat today.");
			System.out.println("Did you want to buy some merchandise?");
		break;	
		}
		
		
		
		

	}
}
