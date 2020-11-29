package TestPAckage;

public class ArmstrongNumber {

	public static void main(String[] args) {


		//153 == 1*1*1 + 5*5*5 + 3*3*3
	
		int num = 1503 ;
		int r = 0 ;
		int cube =0;
	while(num>0) {
		r=  num%10;
		num = num/10;
		
		cube = cube+ r*r*r ; 
		
		
		
	}
		
	System.out.println(cube);	
		
		
	}

}
