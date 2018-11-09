package assign2;

import java.util.Scanner;

public class printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     int N=scn.nextInt();
     int a=1,b=1;
     int c=scn.nextInt();
     int i=1;
     while(N!=0){
    	 a=3*i+2;
    	 b=a%c;
    	 if(b!=0){
    		 System.out.println(a);
    		 N--;
    	 }
    	 i++;
    	 
    			 
     }
	}

}
