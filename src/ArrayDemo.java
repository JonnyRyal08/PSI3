/**
 * @author jrobertson08
 *
 */
public class ArrayDemo {
	
	public static void twoDArrayDemo() {
		int game1[][] = {{1,2,1,4,3,2,6}, {2,4,1,2,1,4,3}};
		int game2[][] = {{2,4,3,4,2,1,3}, {1,2,1,1,5,2,1}};
		
		System.out.println("This is the first game results: ");
		showScores(game1);
		System.out.println("This is the second game results: ");
		showScores(game2);
		
	}
	
	public static void showScores(int x[][]) {
		for(int row = 0; row < x.length; row++) {
			for(int column = 0; column < x[row].length; column++){
				System.out.println(x[row][column] + "\t");
			}
			System.out.println("\n");
		}
	}
	
		
/*		int[][] scoreBoard1 = new int[2][9]; // 2D int array with 2 rows and 9 columns
		
		for (int team1 = 0; team1 < scoreBoard1.length; team1++) {
			for(int team2 = 0; team2 < scoreBoard1.length; team2++) {
				scoreBoard1[team1][team2] = team1 + team2;
				System.out.println(scoreBoard1);
			}
			//return total;
		}
		
	}
	//public static int getTotal(int[] array)
*/
}
