
public class LongestSubString {

	public static void main(String[] args) {

		String words = "My najafsaome is Deepak kum a Deepakkumar";
		
		
		String[] word = words.split(" ");		
		int temp=word[0].length();
		int i;
		for( i=0;i<word.length;i++) {
		if(word[i].length() > temp) {
				temp = word[i].length();
				System.out.println(word[i]);
			}
		}		System.out.println("Highest is "+temp );
		


		
	}

}
