import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {


		int num[] = {12,43,5,4,23};
		int temp ;
		
//		Arrays.sort(num);
//		
//		System.out.println("Second Largest number is "+ num[(num.length-2)]);
//		
		
			for(int i =0 ; i<num.length;i++) {
				for(int j=i+1;j<num.length;j++) {
					
					if(num[i] > num[j]) {
						
						temp = num[i];
						num[i] = num[j];
						num[j]= temp;
					}
					
				}
				
			}
		
		// So now the array is sorted in ascending order
			
			System.out.println(Arrays.toString(num));
			//get the nth lasgest number 
			System.out.println(num[num.length-2]);
			
	
		
		
		
		
		
		
		
		
		
	}

}
