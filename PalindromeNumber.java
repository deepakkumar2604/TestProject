package DemoPackage;

public class PalindromeNumber {

	public static void main(String[] args) {


		
		
		int num = 123213 ;
		int rev =0 ;
		int temp = num ;
		while(num > 0) {
			
			rev = rev *10 + num%10;
			
			num = num /10 ;
			
			
			
			
		}
		if(rev == temp) {
			
			System.out.println("it is palondrome number");
		}
		else
			System.out.println("It  is not a palindrome number");
		
		
	}

}
