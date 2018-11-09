package assign2;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int []arr;
      Scanner scn=new Scanner(System.in);
      int N=scn.nextInt();
      arr=new int[N];
      for(int i=0;i<arr.length;i++){
    	 arr[i]=scn.nextInt();
      }
      bubblesort(arr);
 	 display(arr);

      
	}
	public static void display(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
    public static void bubblesort(int []arr){
    	int temp=1;
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length-1;j++){
    			if(arr[j]>arr[j+1]){
    				temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    			
    		}
    	}
    }
}
