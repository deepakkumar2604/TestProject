import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CounTheDuplicatechar {

	public static void main(String[] args) {


		
		String str ="nameodtmmhestringmyluplrim";
		
		char[] c =str.toCharArray() ;
		
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	
	for(char ch: c) {	
		//System.out.println(c);
	if(hm.containsKey(ch)) {
		hm.put(ch, hm.get(ch)+1);
	}
	else
		hm.put(ch, 1);
	}
	
	Set<Character> setname = hm.keySet();
	
	for(char Set: setname) {
		
		if(hm.get(Set) > 1) {
			System.out.println(Set + "    count is  " + hm.get(Set));
			
		}
		
	}
		
		
}
	

}
