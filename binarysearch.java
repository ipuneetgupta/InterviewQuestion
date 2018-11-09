package assign2;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int []arr;
		int N=scn.nextInt();
		arr=new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
        
		}
		int P=scn.nextInt();
		System.out.println(binarysearch(arr,P));
		
	} 
	  public static int binarysearch(int []arr,int P){
		  int l=0;int r=arr.length-1;
		  while(l<=r){
			  int mid=(l+r)/2;
			  if(arr[mid]==P){
				  return mid;
			  }
			  else if(arr[mid]<P){
				  l=mid +1;
			  }
			  else if(arr[mid]>P){
				  r=mid-1;
			  }
			  
		  }
		  return -1;
	  }
	
}
