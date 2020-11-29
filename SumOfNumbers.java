
public class SumOfNumbers {

	public static void main(String[] args) {

		int n = 999 ;
		int sum =0;
		
		while(n>0) {
			sum =sum +n%10 ;
			
			n = n/10 ;
		}
		System.out.println(sum);
		int t =0 ;
		while(sum>0) {
			t =t +sum%10 ;
			
			sum = sum/10 ;
	
	
	}
		System.out.println(t);
	}

}
