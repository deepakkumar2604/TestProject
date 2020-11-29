import java.util.HashMap;
import java.util.HashSet;

public class countWordsinaString {

	public static void main(String[] args) {

		String str = "hi i am deepak kumar hi i am from usa" ;


				String words[] = str.split(" ");
		
		
		
		HashMap<String,Integer> hm  = new HashMap<String,Integer>();

			
			for(String word:words)	{
				
				HashSet set = new HashSet<String>();
				if(hm.containsKey(set) == false) {
					System.out.println(set.toString());
				}
			
////				if(hm.containsKey(word)) {
////					hm.put(word,hm.get(word)+1);
////				}else 
////				{
////					hm.put(word, 1);
////				}
//			}
}


	
	}


