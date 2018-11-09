package lecture1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
		int sum=0 ,t1=0,t2=1;
		if(n==0){
		
		}
		else{
		System.out.println("0\n1");}
           int i=3;
			while(i<=n){
				sum=t1+t2;
				System.out.print(sum);

				t1=t2;
				t2=sum;
				i++;
		System.out.println();
			}
		}
	        
}
