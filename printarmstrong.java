package assign2;

import java.util.Scanner;

public class printarmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int min=scn.nextInt();
	int max=scn.nextInt();
   		int sum;
		for(int i=min;i<=max;i++){
			int b=0;
			sum=0;
			b=i;
			while(b!=0){
				int rem=b%10;
				sum=sum+pow(rem,3);
				b=b/10;
			}	
			if(sum==i){
				System.out.println(sum);
			}
			
			
			}
         
	}
	public static int pow(int n,int i){
		int p=1;
		for(int j=0;i!=0;j++){
			p=p*n;
			i--;
		}
		return p;
	}

}
