
public class IsPrime {
	public static String username ="deepak@gmail.com";

	public static void main(String[] args) {
		
	

	System.out.println(	isprime(5));

			primenumbers(15);
	}
	public static boolean isprime(int num ) {
		
		
		// 2 is a prime number 
		
		if(num <2 ) {
			return false ;
		}
		
			for(int i =2 ; i < num; i++) {
				if(num%i == 0) {
					return false ;
				}
			}
			return true ;
}
	
	public static void primenumbers(int num) {
		
		for(int i=0 ; i <=num ; i++) {
			if(isprime(i)== true) {
				System.out.println(i);
			}
						
		}
	
	
	}

}
