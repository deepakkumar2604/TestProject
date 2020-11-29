import java.util.ArrayList;

public class ArraysSorting {

	public static void main(String[] args) {


		
		
		int[] arr1 = {1,34,5,3,2};
		
		int[] arr2 = {34,4,545,6,56};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(34);
		ar.add(432);
		ar.add(3);
		ar.add(35);
		
		
		int temp ;
		for(int i =0 ; i<ar.size();i++) {
			for(int j=1 ; j<ar.size();j++) {
				
				if(ar.get(i) > ar.get(j)) {
					
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp ; 
				}
			}

			System.out.print(arr1[i]+ " ");
			}
		System.out.println();
			
		
		
	}	
}
