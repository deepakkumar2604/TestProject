import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInAArray {

	public static void main(String[] args) {

	//	duplicateStringForLoop("Deepakkumar");
		// duplicatecharUsingHashSet();
		duplicatecharUsingHashMap();
}

	public static void duplicatecharUsingHashMap() {
	
		
String 	Str = "Deepakkumar" ;
		
HashMap<Character,Integer> hm   = new HashMap<Character,Integer>();
		
		char[] ch = Str.toCharArray();
		

for(char c : ch) {
	
	if(hm.containsKey(c) ) {
		hm.put(c, hm.get(c)+1);
	}
	else
		hm.put(c, 1);
	
}

	// need to iterate using emptyset
Set<Character> set = 	hm.keySet();

for(char s : set) {
	if(hm.get(s) > 1) {
		System.out.println(s +"  occuring times are " + hm.get(s));
	}
}


		
		
		
		
	}
	
	
	public static void duplicatecharUsingHashSet() {
		
String 		Str = "Deepakkumar" ;
		
	char[] ch = 	Str.toCharArray() ;


		HashSet<Character> hs = new HashSet<Character>() ;
				
		for(char a :ch ) {
		//	System.out.println(a);
		if(hs.add(a)==false) {
			System.out.println(a);
			
		}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void duplicateStringForLoop(String str) {
	
		
		for(int i =0 ; i<str.length() ; i++) {
			for(int j =i+1; j<str.length(); j++) {
				
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println(str.charAt(i));
				}
				
			}
		}
	}
}
