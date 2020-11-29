import java.util.HashSet;

public class FirstDuplicatenumber {

	public static void main(String[] args) {

		FirstDuplicate();	
		
	}

	public static void FirstDuplicate() {
		 int n[] = {1, 2, 14,1, 4,  3, 7, 5, 5, 2} ;
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0 ; 
		for(Integer number : n) {
			if(count <10) {
			if(set.add(number) == false) {
				System.out.println(number);
				count ++ ;
			}			
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
