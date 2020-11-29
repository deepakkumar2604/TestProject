
public class CountNumbersEgain {

	public static void main(String[] args) {

String str = "I will eat 2 burgers 23 fries & 1.25 cokes l8r" ;
System.out.println(str.length());
int count =0;
	char[] ch = str.toCharArray();

		for(char c: ch) {
			
			if(Character.isDigit(c)) {
				count++;
			System.out.print(c+ " ");	
			}	
		}
		count = count-2;
		System.out.println("\n"+ count);
		
	}

}
