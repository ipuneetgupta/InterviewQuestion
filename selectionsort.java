package assign2;

import java.util.Scanner;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
//		Scanner scn=new Scanner(System.in);
//		int N=scn.nextInt();
//		int []arr;
//				arr=new int[N];
//		for(int i=0;i<arr.length;i++){
//			arr[i]=scn.nextInt();
//		}
		int []arr=takeinput();
		selectionsort(arr);
		display(arr);
		
	}
    public static int[] takeinput(){
    	Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int []arr;
				arr=new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		return arr;
    }
	public static void display(int []arr){
		for(int i=0;i<arr.length;i++){
	  System.out.println(arr[i]);
	}

	}
	public static void selectionsort(int []arr){
		for(int i=0;i<arr.length-1;i++){
			int min=i;
		  for(int j=i+1;j<arr.length;j++){
			  if(arr[min]>arr[j]){
				  min=j;
			  }
			  int temp=arr[min];
			  arr[min]=arr[i];
			  arr[i]=temp;
		  }	
		}
	}
	
}
