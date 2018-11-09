package assign2;

import java.util.Scanner;

public class octtobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
      
      int bin=octtobin();
      System.out.println(bin);
	}
	public static int octtodec(int N){
		int dec=0;
		int pow=1;
		while(N!=0)
		{ int rem=N%10;
	    dec=dec+rem*pow;
	   pow=pow*8;
	   N=N/10;}
		
	
	return dec;
}
    public static int dectobin(int dec){
    	int bin=0;
    	int pow=1;
    	while(dec!=0){
    		int rem=dec%2;
    		bin=bin+rem*pow;
    		pow=pow*10;
    	  dec=dec/2;
    	}
    	return bin;
    }	
    public static int octtobin(){
        Scanner scn=new Scanner(System.in);

        int N=scn.nextInt();

    	int p=octtodec(N);
    	int q=dectobin(p);
    	return q;
    }
}
