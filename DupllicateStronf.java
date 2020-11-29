import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DupllicateStronf {

	public static void main(String[] args) {


		
		String arr[] = {"hi", "Hai", "Hi", "HAI", "Hi" , "you","you"};
		
		
		for(int i= 0; i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		
		System.out.println("*******************************");
		
		HashSet set = new HashSet();
		
		for(String str: arr) {
			if(set.add(str)==false) {
				System.out.println(str);
			}
		}
		System.out.println("*******************************");
		
		
		
		HashMap<String, Integer> hm = new HashMap< String, Integer>();
		
		for(String store: arr) {
			Integer count = hm.get(arr);
			
			if(count == null) {
				hm.put(store, 1);
			}else
				hm.put(store, ++count);
			
		}
		
		//Entry set to iterate hasmap
		
		
		Set<Entry<String, Integer>> setunique = hm.entrySet();
		
		for(Entry<String,Integer> strs: setunique ) {
			if(strs.getValue() > 1 ) {
				System.out.println(strs.getKey());
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
