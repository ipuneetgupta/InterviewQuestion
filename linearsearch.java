package assign2;

import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scn=new Scanner(System.in);

			int[] arr;
			int N = scn.nextInt();

			
			arr = new int[N];
			for (int i = 0; i < arr.length; i++) {
				
				arr[i] = scn.nextInt();}
			
			               int P=scn.nextInt();

			        System.out.println(LinearSearch(arr, P));
			        
			        
			    }
			

			    	
				
			        public static int LinearSearch(int[] arr, int data) {
					for (int i = 0; i < arr.length; i++) {
						if (arr[i] == data) {
							return i;
						}
					}

					return -1;

				}
			        

}
