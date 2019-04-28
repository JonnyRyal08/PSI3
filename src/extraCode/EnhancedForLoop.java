package extraCode;
/**
 * @author jrobertson08
 *
 */
public class EnhancedForLoop { //using an enhanced for loop to find sum of an array
	public static void main(String[] args) {
		int[] numbers = {2009, 2011, -1980, -44, 38, -9, 7, -2018, 1998};
		int sum = 0;
			for(int totalOfArray: numbers) {
				sum += totalOfArray;
			}
			System.out.println("Sum = " + sum);
	}
}
