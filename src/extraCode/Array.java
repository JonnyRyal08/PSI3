package extraCode;

import java.io.*;
import java.util.*;
/**
 * @author jrobertson08
 *
 */
//this is a hackerrank exercise
public class Array{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lines = new ArrayList<ArrayList<Integer>>();
        int n = scan.nextInt();
        
        for (int row = 0; row < n; row++){
            int d = scan.nextInt();
            lines.add(new ArrayList<Integer>());
            for (int colum = 0; colum < d; colum++){
                lines.get(row).add(scan.nextInt());
            }  
        }
        
        int q = scan.nextInt();
        scan.nextLine();
         
        for (int query = 0; query < q; query++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            try{
                System.out.println(lines.get(x-1).get(y-1));
            }catch (Exception ex){
                System.out.println("ERROR!");
            }
        }
        
        scan.close();  
            
        }
    }