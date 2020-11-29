package ExercisePackage;


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountEachChar {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {


		
		
		
		String str = "Deepak kumar";
		

		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		char[] ch = str.toCharArray();

		for(char Ch:ch ) {
			if(hm.containsKey(ch)) {
				hm.put(Ch, hm.get(Ch)+1);
			}else
				hm.put(Ch, 1);
		}
		
		
		Set <Character>  set = hm.keySet();
		for(char S: set) {
			System.out.println(S + "  count is "+  hm.get(S));
		}

	}

}
