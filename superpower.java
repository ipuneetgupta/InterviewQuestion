package assign2;

import java.util.Scanner;

public class superpower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
      int a=scn.nextInt();
      int b=scn.nextInt();
      System.out.println(pow(a,b));
	}
   public static int pow(int a,int b){
	   int sum=1;
	   
	   while(b!=0){
		   sum=sum*a;
		   b--;
	   }
	   return sum;
   }

}
