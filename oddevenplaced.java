package lecture1;

import java.util.Scanner;

public class oddevenplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int row=1;
		int col=1;
		int a=1;
		while(row<=N){
			col=1;
			
			while(col<=row){
				System.out.print(a+"\t");
				
				a++;
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
