package lecture1;

import java.util.Scanner;

public class oddevenindigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner scn=new Scanner(System.in);
	        int N =scn.nextInt();
	        int r;
	        int even=0,odd=0;
	        
	        while(N!=0){
	        	
		        	r=N%10;
		        	if(r%2==0){
		        		even=even+r;
		        	}
		        	else{
		        		odd=odd+r;
		        	}
	        	
	 
	        	N=N/10;
	        
	        }
	    	System.out.println(even);
     	System.out.println(odd);
	}

}
