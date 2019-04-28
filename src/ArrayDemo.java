/**
 * @author jrobertson08
 *
 */
public class ArrayDemo {
	
	public static void twoDArrayDemo() {
		final int SIZE = 9; 
		
		int[][] scoreBoard1 = new int[2][9]; // 2D int array with 2 rows and 9 columns
		
		for (int team1 = 0; team1 < scoreBoard1.length; team1++) {
			for(int team2 = 0; team2 < scoreBoard1.length; team2++) {
				scoreBoard1[team1][team2] = team1 + team2;
				System.out.println(scoreBoard1);
			}
			//return total;
		}
		
	}
	//public static int getTotal(int[] array)

}
