package lecture1;

public class practice {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	        int N=scn.nextInt();
	        boolean flag;
	        int r;
	         while(2<=N){
	             flag=true;
	             int divisor=2;
	             while(divisor<N){
	                 r=divisor%2;
	                 if(r==0){
	                     flag=false;
	                 }
	                 else {
	                     flag=true;
	                 }
	                 divisor++;
	             }
	             if(flag==true)
	             {System.out.println(N);}
	             N++;
	             
	             
	         }
	        
		
		
		
}
	

}
