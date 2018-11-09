package assign2;

import java.util.Scanner;

public class maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Scanner scn=new Scanner(System.in);
			       int[] arr = takeInput(); 
			               

			        System.out.println(max(arr));
			        
			        
			    }
			
				
			    	public static int[] takeInput() {
			  		  Scanner scn=new Scanner(System.in);

					int[] arr;
					int N = scn.nextInt();

					
					arr = new int[N];
					for (int i = 0; i < arr.length; i++) {
						
						arr[i] = scn.nextInt();}
					
					return arr;
					
						
					}
			    	public static int max(int[] arr) {
			    		int max = Integer.MIN_VALUE;
			    		for (int i = 0; i < arr.length; i++) {
			    			if (arr[i] > max) {
			    				max = arr[i];
			    			}
			    		}
			    		return max;
			    	}

}
