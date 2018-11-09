package lecture1;

public class primen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=2;
		int end= 60;
		 boolean flag=true;
		while(start<=end){
			flag=true;
			int i=2;
			while(i<start){
				
				if(start%i==0)
				{
					flag=false;
					 
				}
				i++;}
				if(flag==true)
				{System.out.print(start +" ");}
			
			start++;
		}
		

	}

}
