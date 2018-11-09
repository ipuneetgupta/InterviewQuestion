package assign2;

import java.util.Scanner;

public class anytoany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn =new Scanner (System.in);
		int sb=scn.nextInt();
		int db=scn.nextInt();
		int N=scn.nextInt();
		System.out.println(anytoany(N,sb,db));
	}
	public static int anytodec(int N,int sb){
	 int num=0;
	 int pow=1;
	 while(N!=0){
		 int rem=N%10;
		 num=num+rem*pow;
		 pow=pow*sb;
		 N=N/10;
	 }
	   return num;
	}
    public static int dectoany(int dec,int db){
    	int num=0;
    	int pow=1;
    	while(dec!=0){
    	int rem=dec%db;
    	num=num+rem*pow;
    			pow=pow*10;
    	dec=dec/db;
    	}
    	return num;
    }
    public static int anytoany (int N,int sb,int db){
        int p=anytodec(N,sb);
        int q=dectoany(p,db);
        		return q;	
    }
    }
