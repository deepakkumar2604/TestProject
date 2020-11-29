import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
	
		
		
		int[] arr = {3,3,2,12,32,212,42};
		
//		 Arrays.sort(arr);
//		System.out.println(arr);
//		
		
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("*********************");
		
		for(int i=arr.length-1;i>0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
