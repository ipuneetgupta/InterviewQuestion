package assign2;

import java.util.Scanner;

public class inversearr {

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
			
			return arr;
			
				
			}
         public static void reverse(int []arr){
      	   int temp=1;
      	   int a=1;
        for(int i=0;i<arr.length-1;i++){
      	  temp=arr[a];
      	  arr[temp]=a;
      	  a++;
      	  
        }
      	   
         

	}

}
