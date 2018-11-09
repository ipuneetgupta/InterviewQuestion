package assign2;

import java.util.Scanner;

public class basiccal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner scn=new Scanner(System.in);
	do{
    char m=scn.next().charAt(0);
    if(m=='/'||m=='*'||m=='+'||m=='-'){
    int n1=scn.nextInt();
    int n2=scn.nextInt();
    int result;
    switch(m){
    case '+':
    	result=n1+n2;
    	break;
    	
    case  '/':
    	result=n1/n2;
    	break;
    	
    case '*':
    	result=n1*n2;
    	break;
    case '-':
    	result=n1-n2;
    	break;
    default:
    	System.out.println("Invalid operation. Try again.");
    	//return;
    
    
    System.out.println(result);}
    }
    while(m!='X'||m!='x');
        
	
	
	}
	}
