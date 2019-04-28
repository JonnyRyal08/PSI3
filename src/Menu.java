
//Menu for In-N-Out
//prices may or maynot be accurate to store

import java.util.ArrayList;

/**
 * @author jrobertson08
 *
 */
public class Menu {
	// private fields
	private ArrayList<Item> burgers = new ArrayList<Item>();// arraylist burgers stores types of burgers
	private ArrayList<Item> fries = new ArrayList<Item>(); // arraylist fries stores types of fries
	private ArrayList<Item> drinks = new ArrayList<Item>(); // arraylist drinks stores types of drinks
	private ArrayList<Item> shakes = new ArrayList<Item>(); // arraylist shakes stores types of shakes
	private ArrayList<Item> secrets = new ArrayList<Item>(); // arraylist secret menu stores types of secret

	// constructors
	public Menu() {
		populateMenu(); // constructor without parameters allows items to be put in array
	}

	// public getters and setters
	/**
	 * @param burger
	 * @return
	 */
	public Item getBurgers(int burger) {
		return burgers.get(burger);
	}

	/**
	 * @param fry
	 * @return
	 */
	public Item getFries(int fry) {
		return fries.get(fry);
	}

	/**
	 * @param drink
	 * @return
	 */
	public Item getDrinks(int drink) {
		return drinks.get(drink);
	}

	/**
	 * @param shake
	 * @return
	 */
	public Item getShakes(int shake) {
		return shakes.get(shake);
	}

	/**
	 * @param animal
	 * @return
	 */
	public Item getSecret(int animal) {
		return secrets.get(animal);
	}

	// returns the size of the category Burgers
	/**
	 * @return
	 */
	public int getBurgersSize() {
		return burgers.size();

	}

	/**
	 * @return
	 */
	public int getFriesSize() {
		return fries.size();
	}

	/**
	 * @return
	 */
	public int getDrinksSize() {
		return drinks.size();
	}

	/**
	 * @return
	 */
	public int getShakesSize() {
		return shakes.size();
	}

	/**
	 * @return
	 */
	public int getSecretSize() {
		return secrets.size();
	}
//	public int getSex() {
//		return e.get(sex);
//	}

	// returns all Items in the array
	/**
	 * @return
	 */
	public String getAllBurgers() {
		StringBuilder burgerMenu = new StringBuilder();
		burgerMenu.append("Burgers:\n");
		System.out.println();
		for (int b = 0; b < burgers.size(); b++) { // for loop to return list of burgers
			Item burger = burgers.get(b);
			burgerMenu.append("B").append(b + 1).append(" ").append(burger.toString()).append("\n");
		}
		return burgerMenu.toString();
	}

	/**
	 * @return
	 */
	public String getAllFries() {
		StringBuilder fryMenu = new StringBuilder();
		fryMenu.append("Fries:\n");
		System.out.println();
		for (int f = 0; f < fries.size(); f++) { // for loop to return list of fries
			Item burger = fries.get(f);
			fryMenu.append("F").append(f + 1).append(" ").append(burger.toString()).append("\n");
		}
		return fryMenu.toString();
	}

	/**
	 * @return
	 */
	public String getAllDrinks() {
		StringBuilder drinkMenu = new StringBuilder();
		drinkMenu.append("Drinks:\n");
		System.out.println();
		for (int d = 0; d < drinks.size(); d++) { // for loop to return list of drinks
			Item drink = drinks.get(d);
			drinkMenu.append("D").append(d + 1).append(" ").append(drink.toString()).append("\n");
		}
		return drinkMenu.toString();
	}

	/**
	 * @return
	 */
	public String getAllShakes() {
		StringBuilder shakeMenu = new StringBuilder();
		shakeMenu.append("Shakes:\n");
		System.out.println();
		for (int s = 0; s < shakes.size(); s++) { // for loop to return list of shakes
			Item shake = shakes.get(s);
			shakeMenu.append("Sh").append(s + 1).append(" ").append(shake.toString()).append("\n");
		}
		return shakeMenu.toString();
	}

	public String getAllSecrets() {
		StringBuilder secretMenu = new StringBuilder();
		secretMenu.append("Secrets:\n");
		System.out.println();
		for (int se = 0; se < secrets.size(); se++) { // for loop to return list of secrets
			Item secret = secrets.get(se);
			secretMenu.append("Sec").append(se + 1).append(" ").append(secret.toString()+"\n");
		}
		return secretMenu.toString();
	}

	// methods
	public void populateMenu() {
		// burger
		burgers.add(new Item("Hamburger\t", "Burger", 2.10, "Single"));
		burgers.add(new Item("Cheeseburger\t", "Burger", 2.40, "Cheese"));
		burgers.add(new Item("Double Double\t", "Burger", 3.45, "Double"));

		// fries
		fries.add(new Item("Large Fry\t", "Fries", 2.99, "Large"));
		fries.add(new Item("Medium Fry\t", "Fries", 2.49, "Medium"));
		fries.add(new Item("Small Fry\t", "Fries", 1.99, "Small"));

		// drinks
		drinks.add(new Item("Large Drink\t", "Soft Drink", 1.85, "Large"));
		drinks.add(new Item("Medium Drink\t", "Soft Drink", 1.85, "Medium"));
		drinks.add(new Item("Small Drink\t", "Soft Drink", 1.85, "Small"));

		// Shakes
		shakes.add(new Item("Chocolate\t", "Shakes", 2.15, "Chocolate"));
		shakes.add(new Item("Strawberry\t", "Shakes", 2.15, "Strawberry"));
		shakes.add(new Item("Vanilla\t", "Shakes", 2.15, "Vanilla"));

		// Not so secret menu
		secrets.add(new Item("Animal Style Double Double\t", "Secret", 4.45, "Animal"));

	}

}
