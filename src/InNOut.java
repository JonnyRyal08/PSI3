import java.util.Scanner;

//Jonathan Robertson
//Restaurant In-N-Out 
//PSI3 updated version
//need to create other restaurants

public class InNOut {
	public static void main(String[] args) {
		Menu menu = new Menu();
//		Item burger1 = menu.getBurgers(0);
//		Item burger2 = menu.getBurgers(1);

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
		
		System.out.println("What would you like to order?");
		System.out.println("1. Meal #1");
		System.out.println("2. Meal #2");
		System.out.println("3. Meal #3");
		
	}
}
