package ExercisePackage;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "holle";

		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("It is an anagram");
		}
		else
		{
			System.out.println("It is not an anagram");
		}
	}
}