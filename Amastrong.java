
public class Amastrong {

	public static void main(String[] args) {


		int num = 153; 
		
		int t =num ;
		int r =0;
		int cube = 0 ; 
		while(num > 0) {
			
			
			r =num%10 ;
			num =num/10 ;
			
			cube = cube+ (r*r*r);
			
		}
		System.out.println(cube);
		
		
		
	}

}
