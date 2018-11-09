package assign2;

import java.util.Scanner;

public class fartocel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int min=scn.nextInt();
		int max=scn.nextInt();
		int diff=scn.nextInt();
		while(min<=max){
		int c=5*(min-32)/9;
	    System.out.print(min+"\t");
		System.out.print(c);


		min=min+diff;
		System.out.println();
		}
		}
	}


