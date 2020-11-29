import java.util.regex.Pattern;

public class split {

	public static void main(String[] args) {

		String str = "Hi Deepaak How are you";
	
		String[] temp = str.split(" ");
		
		String rev = "";

	 for (int i = 0; i < temp.length; i++) {            
             rev = " "+temp[i] + rev;
         }
         System.out.println("The reversed string is: " + rev);
     }
}
