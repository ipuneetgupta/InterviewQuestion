package lecture1;

import java.util.Scanner;

public class patterncb {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
      Scanner scn=new Scanner(System.in);
      int N=scn.nextInt();
		int row=1;
		int col=1;

		
		int zero=0;
		int i=1;
		while(row<=N){
		   col=1;
		   while(col<=1){
			   System.out.print(row+"\t");
			   
			   col++;
			
		   }
		   i=1;
		   while(i<=row-2){
			   System.out.print(zero+"\t");
			   i++;
		   }
		   col=1;
		   while(col<=1){
			   if(row>1)
			   { System.out.print(row+"\t");}
			   
			   col++;
		   }
		   System.out.println();
		   
			row++;
		

	}
	}
}
