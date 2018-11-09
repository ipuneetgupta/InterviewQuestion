package assign2;

import java.util.Scanner;

public class integralroot {

	
	 public static double calculateSqrt (int n) {
         
		    int rootValue = 1;
		    int num = n;
		     
		    for (int i = 0; i < n; i++) {
		         
		        rootValue = (int)(0.5 * (rootValue + num/rootValue));
		    }   
		 
		    System.out.println( rootValue);
		     
		    return rootValue;
		     
		    }
	  public static void main (String[] args) {
	         
	        int n;
	         
	        Scanner input = new Scanner (System.in);        
	         
	        n = input.nextInt();    
	         
	        calculateSqrt(n);
	    }
		     

}
