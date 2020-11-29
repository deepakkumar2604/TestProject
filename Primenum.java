
public class Primenum {

	public static void main(String[] args) {
	
		
		
		System.out.println(isprime(5));
	}

	public static boolean isprime(int num) {
		
		
		if(num<2) {
			System.out.println("It is not an prime number");
			return false;
		}
		for(int i =2 ; i<num;i++) {
			if(num%i == 0) {
							
				return false ;
			}
		}
		return true ;
		
		
		
		
	}
	
}
