package lecture1;

public class swappart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int first =2;
        int second =4;
        
        System.out.println("before the swapping");
        System.out.println("first no."+first);
        System.out.println("second no."+second);
        
        first=first-second;
        second=first +second;
        first=second-first;
        
        System.out.println("after swapping");
        System.out.println("first no."+first);
        System.out.println("second no,"+second);
		
		
	}

}
