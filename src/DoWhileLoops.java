//Jonathan Robertson

import java.util.Scanner;

public class DoWhileLoops {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Enter a number: ");
		int value = scanner.nextInt();
		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		int value = 0;
			//must declare int value outside of brackets.
		do {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
			//int value = only exist within these curly brackets
		}
		while(value != 5);
			
		System.out.println("Got 5!");
		
		
	}
}
