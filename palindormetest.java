
public class palindormetest {

	public static void main(String[] args) {


		reverse(1234);
	}

	
	public static void reverse(int num) {
		
	num = 1234;
	int rev = 0 ;
	while(num > 0) {
		rev  = rev *10 + num%10 ;
		num = num/10 ; 
		
		
	}
	 System.out.println(rev);
		
		
	}
	
	
	
}
