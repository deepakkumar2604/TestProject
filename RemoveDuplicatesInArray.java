import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]  = {10,10,30,23,23,45};
		
		
		System.out.println(Arrays.toString(arr));
		
//		Set set = new HashSet();
//		
//		for(int i: arr) {
//			set.add(i);
//			
//			
//		}
//		
//		
//		for(Object s:set) {
//			System.out.println(s);
//		}
//		
		ArrayList ar = new ArrayList();
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print("Duplicate Elemnets "+arr[i]);
						}else
					ar.add(arr[i]);
			}
		}
		
		for(Object n: ar) {
System.out.print (n+ " ");

		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
