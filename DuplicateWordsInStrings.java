
package ExercisePackage;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsInStrings {

	public static void main(String[] args) {


		String str = "Hi how are you how you doing";
		
	String[] words = 	str.split( " ");
		
	HashMap<String,Integer> hm = new HashMap<String,Integer>();
	
	for(String word:words ) {
		System.out.println(word);
		if(hm.containsKey(word)) {
			hm.put(word, hm.get(word)+1);
		}
		else
			hm.put(word, 1);
		
	}
	// iterate the hashmap
//
//					Set<String> set =  hm.keySet();	
//		for(String s : set) {
//			if(hm.get(s)>1) {
//				System.out.println(s  + " "+  hm.get(s));
//			}
//		}
//		
//	}
	
	Set<Entry<String,Integer>> set = hm.entrySet();
	
	
	for(Entry<String,Integer> Set: set) {
		if(Set.getValue()>1)
		System.out.println(Set);
	}
	
	}

}
