

public class prime {

	public static void main(String[] args) {


		System.out.println(isprime(5));
		
		
	}
	
	//fiboanssi - for 
	//fact - for loop
	// prime number  --for loop
	// divide by 1 and n ;
	//least prime number =2 ;
	// create boolean method;
	
	public static boolean isprime(int n) {
	
		if (n<2) {
			return false ;
		}
	
		for(int i =2 ; i<n; i++) {
			if(n%i==0) {
				return false ;
			}
		}
		
		return true ;
		
	}
	

}