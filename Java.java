import java.util.ArrayList;

public class Java {

	public static void main(String[] args) {
//		Take the string "PROLEARNING" and reverse the string at every 4 characters : example the result should be LORP NRAE GNI and all the three words should be stored in new array. 
//		Ensure you are not hardcoding any values
//		Hi

		
		String str = "PROLEARNING" ;
		
	
		// reverse
		String rev = "";	
		for(int i =str.length()-1;i>=0;i--) {
			rev = rev+ str.charAt(i);
		}
		System.out.println();
		System.out.println(rev);
		System.out.println(rev.length());
		ArrayList<String> list = new ArrayList<String>();
		list.add(rev.substring(7));
		list.add(rev.substring(3,7));
		list.add(rev.substring(0,3));
		
		for(String array: list) {
			System.out.println(array);
		}
	}
	

	

}
