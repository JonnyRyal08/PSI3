package staircaseNestedWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number of rows you want printed.");
		int n = scanner.nextInt();

		// StringBuilder staircase() //use StringBuilder to make staircase for
		// hackerrank

		int width = n; // &height
		int lineNum = 1; // &num#'s
		int spot = 1;

		while (lineNum <= width) {
			while (spot <= width - lineNum) {
				System.out.print(" ");
				spot = spot + 1;
			}
			while (spot <= width) {
				System.out.print("#");
				spot = spot + 1;
			}
			System.out.println(" ");
			spot = 1;
			lineNum = lineNum + 1;
		}

	}
}
