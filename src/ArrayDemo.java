/**
 * @author jrobertson08
 *
 */
public class ArrayDemo {
	
	public static void twoDArrayDemo() {
		final int size = 9;
		
		int[][] scoreBoard = new int[2][9]; // 2D int array with 2 rows and 9 columns
		
		for (int team1 = 0; team1 < scoreBoard.length; team1++) {
			for(int team2 = 0; team2 < scoreBoard.length; team2++) {
				scoreBoard[team1][team2] = team1 + team2;
				System.out.println(scoreBoard);
			}
			//return total;
		}
		
	}
	//public static int getTotal(int[] array)

}
