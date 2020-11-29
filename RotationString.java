
public class RotationString {

	public static void main(String[] args) {


		String str1 = "abcde" ;
		String str2 = "cdeab" ;
		
		
		if(str1.length() != str2.length()) {
			System.out.println("it is not rotation string");
		}
		else {    
			System.out.println(str1);
           // Concatenate str1 with str1 and store it in str1    
            str1 = str1.concat(str1);   
            System.out.println(str1);
            //Check whether str2 is present in str1    
            System.out.println(str2);
            System.out.println(str1.indexOf(str2));
            
            if(str1.indexOf(str2) != -1)    
                System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string");    
        }    
    }    	 
		
		
		
	}

