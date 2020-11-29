package ExercisePackage;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {

			int[] num = {13,42,4,352,5,35,23,4234} ;
			
			
			int max = num[0];
			
			for(int i =0;i<num.length; i++) {
				
				if(max < num[i]) {
					max = num[i];
				}
				
				
			}
			System.out.println(max);
			
			
		
		
	}

}
