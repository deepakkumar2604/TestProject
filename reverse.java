
public class reverse {

	public static void main(String[] args) {


		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

System.out.println(factorialrec(5));
System.out.println(factorialNonrec(5));		
		
	}
	public static int factorialNonrec(int num) {

		
		int fact =1;
		
		if(num <=1 ) {
			return 1;
		}
		else {
			for(int i=2;i<=num;i++) {
				fact =fact*i;
			}
			
		}
		return fact;
		
		
	}
	
	public static int factorialrec(int num) {
		
		if(num ==0)
			return 1;
		else {
			
		
			return (num *factorialrec(num-1) );
		}
			

		
//	public static boolean isPrime(int num) {
//		
//		//2 is prime numner 
//		
//		
//		if(num<=1) {
//			return false;
//		}
//	for(int i=2;i<num;i++) {
//		
//		if(num % i == 0) {
//			return false;
//		}
//	}
//	return true;	
//		
//}
//	public static void listofprime(int num) {
//		
//		for(int i=2;i<=num;i++) {
//			if(isPrime(i)) {
//				System.out.println(i);
//			};
//		}
//	}
//	
	
	
	
	}
}