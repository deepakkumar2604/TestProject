import java.util.ArrayList;
import java.util.Arrays;

public class JavaBasics {

	public static void main(String[] args) {
		
		
		ArrayList<String> AList =  new ArrayList();
		
		AList.add("120");
		AList.add("String");
		AList.add("name");
		

			System.out.println(AList);
			System.out.println(AList.size());
			System.out.println(AList.get(1));
			System.out.println(AList.indexOf("String"));
			
			for(String al: AList) {
				System.out.println(al);
				
			}
			AList.sort(null);
			for(String al: AList) {
				System.out.println(al);
				
			}
			
			int[] numb = {1,3,5,6,34};
			for(int al: numb) {
				System.out.println(al);
				
			}
			
			
			Arrays.sort(numb);
			for(int al: numb) {
				System.out.println(al);
				
			}	
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);

		System.out.println(inputList.length);
		
		// Call to sort the input list.
		Arrays.sort(inputList,String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		System.out.println("\n-------Sorted List-------");
		showList(inputList);

		// Call to sort the input list in case-sensitive order.
		System.out.println("\n-------Sorted list (Case-Sensitive)-------");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		showList(inputList);
	}


public static void showList(String[] array) {
	for (String str : array) {
		System.out.print(str + " ");
	}
	System.out.println();
}

}
