
//Restaurant In-N-Out display menu, take order, and calculate total. 
//PSI3 updated version
//need to create other restaurants
//project turned into a list of requirements for integration project
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jrobertson08
 *
 */
public class InNOut {
	/**
	 * @param args
	 */
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
		order.add(teeShirt); // polymorphism by adding merchandise to the arraylist as type Item
		order.add(fry);
		order.add(drink);

		// introduction to user
		System.out.println("Hello, welcome to In-N-Out!\nWould you like to place an order?");
		// greeting with excape sequence \n (next line)
		Scanner in = new Scanner(System.in);
		String orderInput = in.nextLine();

		switch (orderInput) { //switch statement to get customer name and start order

		case "Yes":
		case "yes":
		case "Y":
		case "y":
			System.out.println("What is your name? ");
			String customerName = in.nextLine();
			Customer.setName(customerName);
			Customer.setStartOrder(true);
			break;

		case "No":
		case "no":
		case "N":
		case "n":
			System.out.println("Thank you for coming. Next Please...");
			Customer.setStartOrder(false);
			break;
		default:
			String defaultName = "Guest";
			Customer.setName(defaultName);
			Customer.setStartOrder(true);
			break;
		}
		while (Customer.getStartOrder()) { //while statement to continue program 

			System.out.println("Hello " + Customer.getName());

			System.out.println("Please take a look at our menu. ");

			System.out.println("Your order is: " + order);
			System.out.println();

			int[] mealNum = new int[3]; // declares one-dimentional array with 3 elements

			mealNum[0] = 1;
			mealNum[1] = 2;
			mealNum[2] = 3;

			System.out.println("Meal Deals available are: \n");

			for (int i = 0; i < mealNum.length; i++) {
				System.out.println("Meal: #" + mealNum[i]);
			}
			System.out.println();

			// manually searching for the lowest value in an array
			int[] mealDeals = { 1, 2, 3 }; // initialize an array
			boolean found; // boolean value to act as a flag.
			int index; // variable to be used as a counter.

			found = false; // flag initially set to false
			index = 0; // counter set to 0

			while (found == false && index < mealDeals.length) {
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

			// get the sum of an array
			double[] mdPrices = { 4.99, 5.99, 6.99 };
			double sum = getTotal(mdPrices); // double variable sum
			System.out.println("The sum of the array elements is " + sum);
			System.out.println();

			// prints the highest value of arrayValue
			System.out.println("The highest number in the sample array is: " + getHighest());
			System.out.println();

			// prints the lowest value of arrayValue
			System.out.println("The lowest number in the sample array is: " + getLowest());
			System.out.println();

			for (Item inhanFor : order) {
				System.out.println("Item is: " + inhanFor);
			}

//		// gets number of burgers in menu
//		int burgerSize = menu.getBurgersSize();
//		System.out.println("Burgers:\t" + burgerSize);

//		int frySize = menu.getFriesSize();
//		System.out.println("Burgers:\t" + frySize);

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

			//int menuSelection;

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

	}

	public static double getTotal(double[] array) {
		// method calculates through a for loop the Total value of array
		int index;
		double total = 0;
		for (index = 0; index < array.length; index++) {
			total = total + array[index];
		}
		return total;
	}

	public static int getHighest() {
		// getHighest method searches array for highest value
		int[] arrayValue = { 16, 32, 13, 28, 36, 89, 99, 3, 1 };
		int highest = arrayValue[0];
		// for loop to search through arrayValue for highest value
		for (int index = 1; index < arrayValue.length; index++) {
			if (arrayValue[index] > highest)
				highest = arrayValue[index];
		}
		return highest;
	}

	public static int getLowest() {
		// getLowest method searches array for lowest value
		int[] arrayValue = { 16, 32, 13, 28, 36, 89, 99, 3, 0 };
		int lowest = arrayValue[0];
		// for loop to search through arrayValue for lowest value
		for (int index = 1; index < arrayValue.length; index++) {
			if (arrayValue[index] < lowest)
				lowest = arrayValue[index];
		}
		return lowest;
	}

	public static int findNum() {
		int[] arrayValue = { 16, 32, 13, 28, 36, 89, 99, 3, 0 };
		boolean found = false; // boolean variable found set to false for use in while loop
		int index = 0;

		while (found == false && index < arrayValue.length) {
			if (arrayValue[index] == 99)
				found = true;
			else
				index = index++;

		}
		return index;

	}

}
