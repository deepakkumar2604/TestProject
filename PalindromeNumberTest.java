import java.util.Scanner;

public class PalindromeNumberTest {

	public static void main(String[] args) {

System.out.println("Enter the number more than 99 ");

	Scanner scan = new Scanner(System.in);
	int userinput = scan.nextInt();
		
	isPalindrome(userinput);
	
	nearestpalidrome(userinput);
	
	}
	
	
	public static boolean isPalindrome(int num) {
		
	  int rev = 0 ;
	 int temp = num ; 
		while(num>0) {
			
			rev = rev *10 + num%10;
			num = num/10 ;
			
		}

	
		if(rev == temp) {
					return true;
		}
	else {
		return false;
	}
	}
// to find nearest palidrome:
	
	
	public static void nearestpalidrome(int num) {
		
		// 2 types 
		// fwp or bwp
		int t = num ;
		num = t-1 ;
		while(!isPalindrome(num)) {
			num -- ;
		}
		System.out.println("nearest baclwardd palidrome is "+ num);
		num = t +1 ;
		
		while(!isPalindrome(num)) {
			
			num ++ ;
		}
		System.out.println("Nearest forward Palidrome is " + num);
		
		
		
	}












}
