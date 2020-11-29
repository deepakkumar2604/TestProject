
public class PalindiomeString {

	public static void main(String[] args) {


	String str = "bosob" ;
	
	StringBuffer sb = new StringBuffer(str);
	sb = sb.reverse();
	System.out.println(str);
	if(str.equals(sb.toString())) {
		
		System.out.println("***************It is panlindrome");
	};
	
	String rev = "";
	
	String temp = str ; 
	for(int i = str.length()-1 ; i>=0; i --) {
		rev = rev + str.charAt(i);
	}
	System.out.println(rev);
	System.out.println(temp);
	
	
	if(rev.equals(temp) ){
		System.out.println("it is palindrome");
	}
	else
		System.out.println("it is not palindrome");
	}		

}
