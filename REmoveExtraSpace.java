import java.util.StringTokenizer;

public class REmoveExtraSpace {

	public static void main(String[] args) {

		//1st method
		String str = "india    is   my  h        country   ";
		
		System.out.println(str.replaceAll("\\s+", " "));
		
		
		
		
		
		// 2nd method:
		
		char[] chArray = str.toCharArray();
		
		for(int i =0;i<chArray.length;i++) {
			StringBuffer sb = new StringBuffer();
			
				
			if((chArray[i] != ' ') ) {
			sb.append(chArray[i] );
				
			}
			
			System.out.print(sb.toString());
			
		}
		
		
//		//3rd method
//		 String input = "Try    to    remove   extra   spaces.";
//	        StringTokenizer substr = new StringTokenizer(input, " ");
//	        StringBuffer sb = new StringBuffer();
//	        
//	        while(substr.hasMoreElements()){
//	            sb.append(substr.nextElement()).append(" ");
//	        }
//	        
//	        System.out.println("Actual string: " + input);
//	        System.out.println("Processed string: " + sb.toString().trim());
	    }

	}


