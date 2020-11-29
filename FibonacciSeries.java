
public class FibonacciSeries {

	public static void main(String[] args) {

		
		int n =8 ; 
		
		int a = 0 ;
		int b =1 ;
		int c ;
		System.out.println(a);
		System.out.println(b);
		for(int i =2; i<=n;i++) {
			
		c= a+b;
		System.out.println(c);
		a=b;
		b=c;
			
		}

		
		
	}

}
