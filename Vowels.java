
public class Vowels {

	public static void main(String[] args) {


		String str = "Deepak kumar s my name" ;
		System.out.println(str.length());
		int vowels =0; 
		int cons = 0;

	str.replace(" ", "");
		System.out.println(str.length());
		for(int i =0; i<str.length();i++) {
			if(str.charAt(i) =='a'||str.charAt(i) =='e'||str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u' ){
				vowels ++ ;
				System.out.println(str.charAt(i));
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z') {
				cons ++ ;

				System.out.println(str.charAt(i));
			}
				
		}
		System.out.println("Cons" + cons);
		System.out.println("vowels" + vowels);
		
		
	}

}
