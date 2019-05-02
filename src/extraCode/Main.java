package extraCode;
/**
 * @author jrobertson08
 *
 */
/*
Eagle Eats - Collect order from user and calculate total and tip + psi requirements
*/

//requirements from PSI1 and PSI2

import java.util.Random;//Random imported to be used as a number generator
import java.util.Scanner;//Scanner imported to take input from user
//	built in data types within Java include:
//	byte - 8-bit/ minValue -128 / maxValue 127(inclusive)
//	short - 16-bit/ minValue -32,768 / maxValue 32,767
//	int - 32-bit/ minValue -2^31 / 2^31-1
//	long - 64-bit/ minValue -2^63 / 2^63-1
//	float - 32-bit IEEE 754 floating point use if you need to save memory in large arrays
//	double - 64-bit
//	boolean (true or false)
//	char - 16 bit unicode character minValue = 0 / maxValue 65,535 
//	support for character strings via the java.lang.String class
/* a variable is a location in memory. In java it is the basic unit of storage in a program
 * 
 * */

public class Main {
	// This is a header
	// public is an access modifier
	// This is the driver class

	public static double squareIt(double n1) {
		// method squareIt returns number squared
		// header with parameter n1
		double squared = n1 * n1;
		return squared;
		// returns number squared

	}

	public static void main(String[] args) {
		// method names should be in lowerCamelCase
		// what is in the (is a parameter)
		// public static void main is a method

		// Cat garfield = new Cat(); //method call to constructor
		// garfield.setName("Garfield");

		System.out.println("Welcome to Eagle Eats!");// greeting to user

		// Get user name (String Variable = an allocation in memmory for user name)
		// Scope = a variable is only accessable within the mehtod that it is declared
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = in.nextLine();

		// print out greeting using escape methods
		System.out.println("Hello " + name + "," + "\nI'm here to take your order. ");

		// Get user total and tip
		double price, tip, total;
		System.out.println("Please enter your the price of your order: ");
		price = in.nextDouble();
		System.out.println("Enter the tip percentage in decimal form: ie. .10 for 10%");
		tip = in.nextDouble();
		total = (price + price * tip);
		System.out.println("Your total is: " + "$" + total);
		in.close();
		System.out.println();

		double num1 = 5;
		// this is a call, in the parentheses is an argument, the call takes on the
		// value of the return

		double squared = squareIt(num1); // call squared method
		System.out.println("method squareIt is called and used: " + squared + "\n");

		Random random = new Random(); // Random class
		int ranInt = random.nextInt(10);
		// generate random number from 0-9 outside of
		// parenthesis shifts values to the right for positive
		System.out.println("This is a random number: " + ranInt + "\n");

		double power = Math.pow(ranInt, 2);// math class method call .pow, arguments (ranInt, 2)
		System.out.println("Math.pow is taking my random number and squares it: " + power + "\n");

		Car myCar = new Car(2017, "Ram", "3500");// overloaded constructor instantiates new car object
		System.out.println(myCar.getInfo());// method call .getInfo
		System.out.println();

		String firstString = "This is the first String";
		String secondString = "compareTo method trial";
		String thirdString = "this is the first string";

		int firstComparison = firstString.compareTo(secondString);
		System.out.println("This is the firstString & secondString using compareTo: " + firstComparison);

		int secondComparison = firstString.compareToIgnoreCase(thirdString);
		System.out.println("This is the firstString & thirdString using compareToIgnoreCase: " + secondComparison);

		int thirdComparison = secondString.compareTo("compareTo method trial");
		System.out.println("This is the secondString with an argument: " + thirdComparison);

		boolean compare = (firstString == secondString); // uses == to compare Strings
		System.out.println(compare + "\n");
		/*
		 * when using == to compare Strings or objects it is comparing the actual
		 * instance of the object and not the value of the String or object. Being that
		 * firstString and thirdString are two different strings even though they have
		 * the same value they are not the same in memory thus making the boolean
		 * compare to be false
		 * 
		 * operator precedence follows math logic, *, / % all multiplicative are
		 * performed before + and - additive operators. ++ and -- can be used both pre
		 * and post increment and decrement. Short circuit conditional operators will
		 * allow for statements to be performed individually from each other. && and ||
		 * will prevent the second operand from executing unless necessary.
		 */
		int f = 1;
		double g = 2;
		int h = 3;

		System.out.println(f++);
		System.out.println(--f);
		System.out.println(g * h - f / g);
		System.out.println(f + h % g);
		
		int whatTimeIsIt = 2359;
		String theTimeItIs = (whatTimeIsIt < 2400) ? "\nLet's get this party started!" : "\nWe "
				+ "started yet?";
		System.out.println(theTimeItIs);
		

	}

}
