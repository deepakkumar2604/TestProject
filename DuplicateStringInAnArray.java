package ExercisePackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateStringInAnArray {

	public static void main(String[] args) {

		String[] words = {"man","cow","man","bird","Bird"};
		
		
		//1st method:For loop
		
		for(int i =0;i<words.length;i++) {
			for(int j =i+1;j<words.length;j++) {
				if(words[i]==words[j]) {
					System.out.println(words[i]);
				}
			}
		}
		// 2nd method using Hashset:
		
		Set<String> set = new HashSet<String>();
		
		for(String word: words) {
			if(set.add(word)==true) {
				System.out.print(word+ " ");
			}
		}
			
		//3rd method: using HashMap
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for(String name:words ) {
			
			if(hm.containsKey(name)) {
				hm.put(name, hm.get(name)+1);
			}else
				hm.put(name, 1);	
			
		}
		
		// need to Iterate via EntrySet;
		
		Set<Entry<String,Integer>>   entry = hm.entrySet();
		
		for(Entry<String,Integer> enter : entry) {
			
			if(enter.getValue() > 0 ) {
				System.out.println(enter );
			}
			
			
		}
	
	}

}
