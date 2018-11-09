package assign2;

import java.util.Scanner;

public class revsersearr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  Scanner scn=new Scanner(System.in);
			       int[] arr = takeInput(); 
			        reverse(arr);
			        display(arr);
			        			        
			    }
	               public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
			       public static int[] takeInput() {
			  		  Scanner scn=new Scanner(System.in);

					int[] arr;
					int N = scn.nextInt();					
					arr = new int[N];
					for (int i = 0; i < arr.length; i++) {						
						arr[i] = scn.nextInt();}
					
					return arr;}					
			    	
			    	public static void reverse(int[] arr) {
			    		int left = 0, right = arr.length - 1;
			    		while (left <= right) {
			    			int temp = arr[left];
			    			arr[left] = arr[right];
			    			arr[right] = temp;
			    			left++;
			    			right--;
			    		}
			    		
			    	}

}
