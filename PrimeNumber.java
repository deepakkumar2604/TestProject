package ExercisePackage;

public class PrimeNumber {

	public static void main(String[] args) {


		System.out.println("Is Prime number " +  isPrime(12) );
		
		listofPrime(12);
		
	}
	
	public static void listofPrime(int num) {
		
		for(int i =0; i<num;i++) {
			if(isPrime(i)==true) {
				System.out.println(i);
			}
		}
		
		
	}
	
	public static boolean isPrime(int num) {
		
		if(num <2 ) {
			return false;
		}
		
		
		for(int i =2; i<num;i++) {
			if(num%i == 0) {
				return false;
			}
				}
		return true;
			
	
	}

}
