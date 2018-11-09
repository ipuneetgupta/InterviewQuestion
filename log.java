package assign2;

import java.util.Scanner;

public class log {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn=new Scanner(System.in);
     int num=scn.nextInt();
     int base=scn.nextInt();
     int rem=1;
     int a=0;
     for(int i=1;num!=1;i++){
    	 rem=num/base;
    	 num=rem;
    	 a++;
     }
     System.out.println(a);
	}

}
