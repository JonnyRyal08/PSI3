/**
 * @author jrobertson08
 *
 */
public class IndexOfArray {
	/**
	 * @param anArray
	 * @param targetValue
	 * @return
	 */
	public static boolean useLoop(String[] anArray, String targetValue) {
		for (String target : anArray) { // enhanced for loop
			if (target.contentEquals(targetValue))
				return true;
		}
		return false;
	}

}
