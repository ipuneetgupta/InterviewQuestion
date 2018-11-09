package assign2;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int []arr;
		arr=new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		insertionsort(arr);
		display(arr);

	}
	public static void display(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]); }
		}
	public static void insertionsort(int []arr)
	{
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		
	}	

}
