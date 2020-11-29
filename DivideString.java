
public class DivideString {

	public static void main(String[] args) {


	
		String  str = "aaabbbcccfsomfoddd" ;
		int n = 3 ;
		int len = str.length() ;
		int temp =0 ;
		String[] strArray = new String[n] ;
		int chare = len/n ;
		System.out.println(chare);
		if(len%n != 0) {
			System.out.println("We cant divide");
		}
		for(int i =0 ; i< len ; i=i+chare) {
			
			strArray[temp]  = str.substring(i, i+chare);
			///System.out.println(temp);
			temp ++ ; 
			System.out.println(temp);
		}
		System.out.println(strArray[0]);

		System.out.println(strArray[1]);
		System.out.println(strArray[2]);
		//System.out.println(strArray[3]);
			
	
	}

}
