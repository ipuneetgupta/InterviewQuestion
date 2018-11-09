package assign2;

import java.util.Scanner;

public class armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
				int sum=0;
				boolean flag=false;
		int N=scn.nextInt();
		int p=0;
		p=N;
		for(int i=0;p!=0;i++){
			int rem=p%10;
			sum=sum+ pow(rem,3);
			p=p/10;}
					
		if(sum==N){
			flag=true;
		}
//		else{
//			flag=false;
//		}
		System.out.println(flag);
		}

		
	
	

   public static int pow(int n,int i){
	   int p=1;
	   for(int j=1;i!=0;j++){
		   p=p*n;
		   i--;
	   }
	   return p;
   }
	
	

}
