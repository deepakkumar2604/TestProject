package ExercisePackage;

public class CountTheFrequnecyOfChar {

	public static void main(String[] args) {


		
        String str = "Learn Lead And Succeed in DevLabsAlliance";
        
        
        char ch = 'A';
        
    	int count = 0;
        for(int i = 0; i<str.length();i++) {
        	
        	//System.out.println(str.charAt(i));
        	if(str.charAt(i) == ch) {
        	
				count ++;
        	}
        	
        }
    	System.out.println(count);
        
		
	}

}
