package assign2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class upperandlowercase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//      BufferedReader scn=new BufferedReader(new InputStreamReader(System.in));
//      char m=(char)scn.read();
		Scanner scn=new Scanner(System.in);
		char m=scn.next().charAt(0);
		if(m>=97&&m<=123){
			System.out.println("L");
		}
		else if(m>=65&&m<=96){
			System.out.println("U");
		}
		else{
			System.out.println("l");
		}
	}

}
