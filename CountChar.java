
public class CountChar {

	public static void main(String[] args) {


		String words = "My najafsaome is Deepak kum a";
		
		
		System.out.println(words.length());
		System.out.println(words.replaceAll(" ", "").length());
		int count =0;	
		
		for(int i=0;i<words.length();i++) {
			
			if(words.charAt(i) != ' ' ) {
				count++;
			}
		}
			
System.out.println(count);

	

	}
}
