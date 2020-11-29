
public class ReverseAEachStringInASenetence {

	public static void main(String[] args) {


		
		
		String str = "India is my country Deepak" ;
		
		String rev = "" ;
		String words[] = str.split(" ");
		
		StringBuffer sb = new StringBuffer() ;
		
		for(int i =words.length-1 ; i>= 0 ;i --) {
			//System.out.println(words[i]);
	
			sb.append(words[i]);
			System.out.print(sb+" ");
			
	}
		
		
		
		
		for(String word : words ) {
			StringBuffer s = new StringBuffer(word);
			s.reverse();
			rev = rev +" "+s;
					}
			
			
	}

}
