
public class ReverseString {

	public static void main(String[] args) {


		String str = "Coimbateoe12";
		
		//usiong String buffer
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

		
		// without using SB:
		
		System.out.println(str.length());
	String rev = "";	
		int len =str.length()
;		for(int i =len-1;i>=0;i--) {
		
	rev = rev+str.charAt(i);
}
		System.out.println(rev);

			
	}

}

//
//JavaScriptExecutor js  = (JavascriptExecutor)driver;
//js.executeScript(document.getElementByID("sdf").value='username');