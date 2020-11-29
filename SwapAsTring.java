
public class SwapAsTring {

	public static void main(String[] args) {


		
		String a = "Deepak" ;
		String b = "Kumar" ;
		
		System.out.println("before swap"+a);
		System.out.println("before swap"+b);
		
		

			
			System.out.println(a+b);
			a = a+b;
		 b = a.substring(0,a.length()-b.length());
				 
				 a = a.substring(b.length());
	
	
				 System.out.println(a);
	
				 System.out.println(b);
	
	
	}

}
