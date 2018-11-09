package lecture1;

public class countdigitnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=45489;
				int a=0;
		while(n!=0){
			n=n/10;
			a++;
		}
		System.out.println(a);
		
	}
		}