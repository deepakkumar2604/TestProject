package ExercisePackage;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {


		int[] arr = {1,2,4,5,6,3,7,9,10};
	
		// how to find missing number
		int sum =0 ;
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		
		int sum1 = 0 ;
		 
		for(int i =0 ; i<=arr.length+1;i++) {
			sum1 = sum1+i;
		}
		System.out.println(sum1);
		
		System.out.println("Missing number is : " + (sum1-sum));
		
		
		
	}

}
