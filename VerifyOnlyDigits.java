
public class VerifyOnlyDigits {

	public static void main(String[] args) {

		
	
	System.out.println(	isnumberic("121213133"));
	System.out.println(	isnumberic(" "));
	System.out.println(	isnumberic("asd1"));
	
	}
	public static boolean isnumberic (CharSequence cs ) {


		
for(int i = 0 ; i< cs.length(); i ++) {
	
	if(!Character.isDigit(cs.charAt(i))) {
		return false ; 
	}
}
return true;
	

}
}