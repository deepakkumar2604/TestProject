package ExercisePackage;

import java.util.Arrays;

public class ArrangeInAlaphabeticalOrder {

	public static void main(String[] args) {


		String[] str = {"C","java","Java", "Python", "JavaScript"};
		//1st method:
//			Arrays.sort(str);
//for(int i =0 ; i<str.length;i++) {
//	System.out.println(str[i]);
//}
//	
	// Sort based on ascii  - 2nd method:

		String temp ;
for(int i =0; i<str.length;i++) {
	for(int j =i+1;j<str.length;j++) {
		//System.out.println("Comparing  " +str[i].compareTo(str[j] ));
		if(str[i].compareTo(str[j]) > 0) {
			
			temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			
		}
	}
}

for(String s: str) {
	System.out.println(s);
}
	}

}
