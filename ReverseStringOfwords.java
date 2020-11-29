
public class ReverseStringOfwords {

	public static void main(String[] args) {


		
		String str = "I am John Doe";
		
		
		String[] word = str.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=word.length-1;i>=0;i--) {
			sb.append(word[i] + " ");			
		}
		
		System.out.println(sb);
	}

	
}
