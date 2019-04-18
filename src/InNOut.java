
//Jonathan Robertson

//Restaurant In-N-Out 
//PSI3 updated version
//need to create other restaurants
import java.util.ArrayList;
import java.util.Scanner;

public class InNOut {
	public static void main(String[] args) {

		Menu menu = new Menu(); // creates new object of class Menu

		ArrayList<Item> order = new ArrayList<Item>(); // arrayList that creates order

		Item burger = new Item("Hamburber", "Burger", 2.10, "Single");// finish menu in main.
		Item fry = new Item("Large Fry", "Fry", 2.99, "Large");
		Item drink = new Item("Large Drink", "Drink", 1.69, "Large");
		
		// next line of code creates an object, initializes its fields with values and
		// passed to the constructor
		Merchandise teeShirt = new Merchandise("TeeShirt", "Merchandise", 15.99, "Large", "male");
		order.add(burger); // adds an Item burger to arraylist order
		order.add(teeShirt); // polymorphism by adding merchandise to the arraylist which extends Item
		order.add(fry);
		order.add(drink);

		System.out.println("Your order is: " + order);
		System.out.println();
		
		
		int[] mealNum = new int[3]; //declares one-dimentional array with 3 elements
		
		mealNum[0] = 1;
		mealNum[1] = 2;
		mealNum[2] = 3;
		
		System.out.println("Meal Deals available are: \n");
		
		for(int i = 0; i < mealNum.length; i++) {
			System.out.println("Meal: #" + mealNum[i]);
		}
		System.out.println();
		
		//manually searching for the lowest value in an array
		int[] mealDeals = {1, 2, 3}; //initialize an array 
		boolean found; //boolean value to act as a flag.
		int index; //variable to be used as a counter.
		
		found = false; //flag initially set to false
		index = 0; //counter set to 0

		while(found == false && index < mealDeals.length) {
			if (mealDeals[index] == 1)
				found = true;
			else
				index = index + 1;
		}
		
		if (found)
			System.out.println("The first Meal Deal is # " + (index + 1));
		else
			System.out.println("This is not the first Meal Deal");
		
		System.out.println();
		
		//get the sum of an array
		double[] mdPrices = {4.99, 5.99, 6.99};
		double sum = getTotal(mdPrices);
		System.out.println("The sum of the array elements is " + sum);
			
		int[] arrayValue = {16, 32, 13, 28, 36, 89, 99, 3, 1}
		int highest = arrayValue[0];
		int lowest = arrayValue[0];
		
		for(int high = [0]; high == highest; i++) {
			System.out.println("Meal: #" + mealNum[i]);
		}
		
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

		// prints a list of Items in Menu
		System.out.println(menu.getAllBurgers());// display the values stored in the arraylist menu
		System.out.println(menu.getAllFries());
		System.out.println(menu.getAllDrinks());
		System.out.println(menu.getAllShakes());
		// System.out.println(menu.getAllSecrets());
		System.out.println();

		// prints an item in menu
		// System.out.println(burger1);
		// System.out.println(burger2);

		int menuSelection;

		System.out.println("Would you like to order?");
		String input = in.nextLine();

		switch (input) {
		case "Yes":
			System.out.println("Good choice, I do believe you are going to enjoy your meal.");
			;
			System.out.println("What will you be having today?");
			break;

		case "No":
			System.out.println("I'm sorry you don't want to eat today.");
			System.out.println("Did you want to buy some merchandise?");
			break;
		}

	}
	public static double getTotal(double[] array) {
		int index;
		double total = 0;
		for(index = 0; index < array.length; index++) {
			total = total + array[index];
		}
		return total;
	}
}
