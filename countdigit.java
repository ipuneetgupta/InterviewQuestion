package assign2;

import java.util.Scanner;

public class countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		int N=scn.nextInt();
		int num=scn.nextInt();
		int a=0;
		while(N!=0){
			int rem=N%10;
			if(rem==num){
				a++;
			}
			N=N/10;
		}
		System.out.println(a);
		

	}

}
