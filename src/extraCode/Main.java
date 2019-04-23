package extraCode;
/**
 * @author jrobertson08
 *
 */
/*
Eagle Eats - Collect order from user and calculate total, tip, delivery charge
*/

import java.util.Random;//Random imported to be used as a number generator
import java.util.Scanner;//Scanner imported to take input from user
	//built in data types within Java include:
	//byte - 8-bit/ minValue -128 / maxValue 127(inclusive)
	//short - 16-bit/ minValue -32,768 / maxValue 32,767
	//int - 32-bit/ minValue -2^31 / 2^31-1
	//long - 64-bit/ minValue -2^63 / 2^63-1
	//float - 32-bit IEEE 754 floating point use if you need to save memory in large arrays
	//double - 64-bit
	//boolean (true or false)
	//char - 16 bit unicode character minValue = 0 / maxValue 65,535 
	//support for character strings via the java.lang.String class

public class Main {
	// This is a header
	// public is an access modifier
	// This is the driver class
	
	public static double squareIt(double n2, double n1, String greeting) {//header with parameters n1, n2, greeting
		double squared = n1 + n1;
		return squared;
		//

	}

	public static void main(String[] args) {
		// method names should be in lowerCamelCase
		// what is in the (is a parameter)
		// public static void main is a method

		//Cat garfield = new Cat(); //method call to constructor
		//garfield.setName("Garfield:);
		
		System.out.println("Welcome to Eagle Eats!");//greeting to user

		// Get user name (String Variable = an allocation in memmory for user name)
		// Scope = a variable is only accessable within the mehtod that it is declared
		String userName;
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name? ");

		String name = in.nextLine();

		// print out greeting using escape methods
		System.out.println("Hello " + name + "," + "\n" + "I'm here to take your order. ");

		// Get user total and tip
		double price, tip, total;
		System.out.println("Please enter your the price of your order: ");
		price = in.nextDouble();
		System.out.println("Enter the tip percentage: ");
		tip = in.nextDouble();
		total = (price + price * tip);
		System.out.println("Your total is: " + "$" + total);
		in.close();
		double num1 = 5;// double 
		double num2 = 10;
		// this is a call, in the parentheses is an argument, the call takes on the
		// value of the return
		double squared = squareIt(num1, num2, "hello"); // call squared method

//		Random random = new Random(); // Random class
//		int ranInt = random.nextInt(10);// generate random number from 0-9 outside of parenthesis shifts values to the right for positive
//		System.out.println(ranInt);
//		double power = Math.pow(ranInt, 2);//math class 
		
//		Car myCar = new Car() {
//			myCar = Ram(1974, Ram, 3500);
//			System.out.println(myCar);
//		}
		
	}

}
