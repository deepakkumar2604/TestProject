import java.util.Arrays;

public class ProductOfTwoMaxNumbers {

	public static void main(String[] args) {

		

		//  1st method
		int num[] = { 10,2, 9, 9, 3, 2, 1, 5, 4, 7 };

		int a = num[0];
		int b = num[1];

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {

				if (num[i] * num[j] > a * b) {
					a = num[i];
					b = num[j];
				}
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a * b);

		
		productoftwonumber();
	}
	
	//  2nd method
	public static void productoftwonumber() {
		
		int num[] = { 2, 9, 9, 3, 2, 1, 5, 4, 7 };

		Arrays.sort(num);
		for(int n: num) {
			System.out.print(n+ " ");
		
		}
		System.out.println("\nlength " + num.length);
	int total  = num[num.length-1] * num[num.length-2] ;
		System.out.println("total is "+total);
		
	}
	
	
	
	

}
