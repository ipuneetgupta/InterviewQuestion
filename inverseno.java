package assign2;

import java.util.Scanner;

public class inverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn=new Scanner(System.in);
    int N=scn.nextInt();
     int inverse=inverse(N);
     boolean flag=true;
     int p=1;
     if(N==inverse){flag=true;}
     else{
    	 flag=false;
     }
     System.out.println(flag);


/*     for(int i=0;N!=0;i++){
     int rem=N%10;
     while(rem!=1){
      p=inverse/10;
    	 rem--;
     }
     N=N/10;}
     if(p==rem){
      flag=true;
     }
    else{  flag=false;
     }
     System.out.println(flag);
		*/
	}
     
	public static int inverse(int N){
		  int num=0;
		     int i=1;
		     while(N!=0){
		  	 int rem=N%10;  	  	 
		     num=num+i*(pow(10,rem-1));	 
		  	 i++;
		  	 N=N/10;
		   }
			 return num;
		
	}
	public static int pow(int n,int o){
		int p=1;
	   for(int i=1;o!=0;i++){
		   p=p*n;
		   o--;
	   }
	   return p;
	}

}
