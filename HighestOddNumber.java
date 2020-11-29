import java.util.ArrayList;

public class HighestOddNumber extends IsPrime {

	
	static IsPrime i = new IsPrime();
public static void callOtherMethod() {
	//System.out.println(	IsPrime.isprime(5));
	//IsPrime.primenumbers(15);
	System.out.println(IsPrime.username);
}
	
	public static void main(String[] args) {
		
		int max =0;
	 int[] arr = {2,3,8,-1,5} ;
	 ArrayList<Integer> oddlist = new ArrayList<Integer>();
	 for(int i = 0 ; i<=arr.length;i++) {
		
		 if(i%2==1) {
			 oddlist.add(i);
		 }
		 
	 }
		 max = (int) oddlist.get(0);
		for(int i =0;i<oddlist.size();i++) {
		if(max  < (int) oddlist.get(i)) {
			max = (int)oddlist.get(i);
		}
		
	}
		System.out.println(max);		
	}
	

	

}
