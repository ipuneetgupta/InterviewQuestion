package lecture1;



public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  r, temp,rev=0;
		int sum=0;
		int n=8458;
		temp=n;
		while(n>0){
			r=n%10;
			sum=sum*10+r;
			rev=sum;
			n=n/10;
			
		}
		if(temp==rev){
			System.out.println("pallindrome");}
		else{
			System.out.println("not pallindrome");}
			
			
			System.out.println(rev +"the reverse of no.");
		

	}

}
