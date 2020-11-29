
public class FActorula {

	public static void main(String[] args) {

		
		
		//4 *3*2*1 =24 
				
		// non recurseive
		int num = 5 ;
		int fact =1 ;
		
		for(int i =1; i<= num;i++) {
			
			fact = fact * i ;
		}
		
		System.out.println(fact);
		
		System.out.println(factor(5));
	}

	
	public static int factor(int num) {
		
		if(num<1) {
			return 1;
		}
	else {
		return num * factor(num-1);
	}
		
		
	}	
}
