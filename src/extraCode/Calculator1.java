package extraCode;
import java.util.Scanner;
/**
 * @author jrobertson08
 *
 */
public class Calculator1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double firstNum, secondNum, thirdNum, answer;
		
		System.out.println("Enter first number: ");
		firstNum = scan.nextDouble();
		System.out.println("Enter second number: ");
		secondNum = scan.nextDouble();
		System.out.println("Enter third number: ");
		thirdNum = scan.nextDouble();
		answer = firstNum + secondNum + thirdNum;
		System.out.println(answer);
		scan.close();
	}
}
