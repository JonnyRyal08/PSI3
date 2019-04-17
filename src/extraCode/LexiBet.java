package extraCode;
//Jonathan Robertson

import java.util.Scanner;

public class LexiBet {
	
    public static void main (String[] args) { //if else constructs
        String smallest = " ";//string 
        String largest = " ";
        String s = "welcomtojava";
        
        int k = 3;//int value
        
        for(int i = 0; i <= s.length()-k; i++) { //header with arguments
        	String lexicograph = s.substring(i, i+k);
        	if(i==0) {//i compares first position of int i to numerical value
        		smallest = lexicograph;
        	}
        	if(lexicograph.compareTo(largest)>0) {//compareTo compares strings
        		largest = lexicograph;
        	}
        	else if (lexicograph.compareTo(smallest)<0) {
        		smallest = lexicograph;
        	}
        	  
        }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        
         System.out.println(smallest + "\n" + largest);
    }

}

