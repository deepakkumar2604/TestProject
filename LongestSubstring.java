package ExercisePackage;

import java.util.HashMap;

public class LongestSubstring {

	public static void main(String[] args) {

		String str = "SoftwareDeveloper n Test Hai SoftwareDevTeamSoftware";

		System.out.println(getUniqueCharacterSubstring(str));
		
//		System.out.println(LongestSub("DeepakkumarNdeepak"));

	}

//	public static String LongestSub(String str) {
//
//		String output = "";
//		HashMap<Character, Integer> hm = new HashMap<>();
//		int i = 0;
//		for (int j = 0; j < str.length(); j++) {
//
//			char ch = str.charAt(j);
//			if (hm.containsKey(ch)) {
//				i = Math.max(hm.get(ch) + 1, i);
//
//			}
//			if (output.length() < j - i + 1) {
//				output = str.substring(i, j + 1);
//			}
//				hm.put(ch, j);
//
//		}
//
//		return output;
//	}

	// best version -o(n)
	public static String getUniqueCharacterSubstring(String input) {
		HashMap<Character, Integer> hm = new HashMap<>();
		String output = "";
		for (int i = 0, j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			if (hm.containsKey(ch)) {
				i = Math.max(hm.get(ch) + 1, i);
			}
			if (output.length() < j - i + 1) {
				output = input.substring(i, j + 1);
			}
			hm.put(ch, j);
		}
		return output;
	}

}
