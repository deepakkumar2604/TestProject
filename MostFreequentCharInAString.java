
public class MostFreequentCharInAString {

	public static void main(String[] args) {


		
		
		String str = "deepppaeeeeeeee";
		
		
		
		int count[] = new int[256];
		
		
		for(int i =0;i <str.length();i++) {
			//System.out.println(str.charAt(i));
			count[str.charAt(i)]++;
		}
		
		int max =0;
		int smax =0;
		char sch = 0,ch = ' ';
		
		
		for(int i=0;i<str.length();i++) {
			
			if(max < count[str.charAt(i)]) {
				smax=max;
				max = count[str.charAt(i)];
				
				ch = str.charAt(i);
			}
			
			else	if(smax < count[str.charAt(i)] ) {
			smax=count[str.charAt(i)];
			sch = str.charAt(i);
		}
		
	}	System.out.println(sch);
	System.out.println(max);
	System.out.println(smax);
	
	
	
	

}
}