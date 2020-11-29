package ExercisePackage;

public class Pangram {

	public static void main(String[] args) {
		IsPangram("abcdefghiklmnopqrstuvwxyz");

	}
	public static boolean IsPangram(String str) {
		
		
		 str = "abcdefghiklmnopqrstuvwxyz";
		
		boolean[] b =  new boolean[26];
		int index =0 ;
		for(int i =0;i<str.length();i++) {
			str = str.toLowerCase();
			if('a' <= str.charAt(i) &&  str.charAt(i)  <=  'z') {
				
				index = str.charAt(i) - 'a' ;
				System.out.print(index + " ");
				b[index] = true;
			}
			
			for(int j=0;i<=25;j++) 
				if(!b[i]) {
					return false;
				}
						
		}
		return true;

		
		
		
		
	}

}
