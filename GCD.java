package assign2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner scn=new Scanner(System.in);
     int N=scn.nextInt();
     int n=scn.nextInt();
     int min;
    if(N<n){
    	min=N;
    }
    else{
    	min=n;
    }
    int a=1;
    int i=1;
     while(i<=min){
    	 
    	if( n%i==0 && N%i==0){
    		 a=i;
    		//System.out.println(a);
    		
    	}
    	i++;
    	
     }
	 System.out.println(a);

	}

}
