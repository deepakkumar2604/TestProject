
public class Palindrom {

	public static void main(String[] args) {


		int num = 151151;
		
		int original = num ;
		
		int rev =0;
		
		while(num != 0 ) {
			rev = rev*10 + num%10 ;
			num =num/10 ;
		}
		System.out.println(rev);
		
		
		
		if(rev == original) {
			System.out.println("it is palindrome");
		}
		else
			System.out.println("it is not a palindrome");
		
	}

}
