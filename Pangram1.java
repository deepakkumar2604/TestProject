
public class Pangram1 {

	public static void main(String[] args) {


		
		String str  = "bcpqrstuvwxyz";
		
		
		
		str = str.toLowerCase();
		
		System.out.println(str.length());
		
		
		boolean[] b = new boolean[26];
		
		int index = 0;
		for(int i =0;i<str.length();i++) {
		
			if('a' >= str.charAt(i) || 'z' <= str.charAt(i)) {
				index = str.charAt(i)-'a';
				b[index] = true;
				
				
			}
		}

		for(int i =0 ; i<25;i++) {
			if(b[i]==true) {
				System.out.print("fasle");
			}
			else 
				System.out.println("true");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
