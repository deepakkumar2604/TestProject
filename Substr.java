
public class Substr {

	public static void main(String[] args) {

		SplitMSIDDN("99999999998888888888");

	}

	public static String SplitMSIDDN(String num) {

		int n = num.length();
		int a = 0;
		int b = 10;
		int c = 0;
		while (n > c) {

		num.substring(a, b);
				c = c + 10;
			a = a + 10;
			b = b + 10;
			
		System.out.println(a);		
		System.out.println(b);
		System.out.println(n);	
		
		}
		return num.substring(a, b);
			}
}
