package extraCode;
//Jonathan Robertson

import java.util.*;
import java.util.Scanner;

public class Staircase {
	static void staircase(int n) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfRows = scanner.nextInt();
		
		staircase(numberOfRows);
			for (int i=0; i<=n; i++);
			System.out.println(numberOfRows);
	}
		
}
