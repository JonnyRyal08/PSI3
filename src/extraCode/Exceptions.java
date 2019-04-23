package extraCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * @author jrobertson08
 *
 */
public class Exceptions {
	public static void main (String[] args) throws FileNotFoundException {
		File file = new File("test.txt");
		FileReader fr = new FileReader(file);
	}
}
