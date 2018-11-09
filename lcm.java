package assign2;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N1=scn.nextInt();
		int N2=scn.nextInt();
		
		for(int i=1;;i++){
			if(i%N1==0&&i%N2==0){
				System.out.println(i);
				break;
			}
		}
		
	}

}
