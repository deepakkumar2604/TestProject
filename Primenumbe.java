
public class Primenumbe {

	public static void main(String[] args) {


		//prime
		//factorial --- 3! == 3*2*1
		//fibonacii
		
		factorail(10);
		System.out.println(factusigrec(5));
		
	}
	
	public static void factorail(int num) {
		
		int fact =1;
		
		for(int i =1 ; i<=num; i ++) {
			
			fact = fact *i ;
		}
		System.out.println(fact);
		

	
	}
	
	public static int factusigrec(int n) {
		
		
		
		if (n ==0 ) {
			
			return 1;
		}
		else
			return (n *factusigrec(n-1) );
		
		
		
		
		
	}
		
		
	
	
	
	
	
	
}
