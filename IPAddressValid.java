
public class IPAddressValid {

	public static boolean main(String[] args) {
		String ip = "10.1123.12.54" ;
		
		String[]  part = ip.split("\\.");
		int num ;
		for(String str : part) {
			System.out.println(str);
			num =  Integer.parseInt(str) ;
			if(num > 255) {
				System.out.println("Invalid IP Address");
				return false; 
				
			}
		
		
		}	System.out.println("valid IP Address" );
		return false;
		
		
		
	}

}
