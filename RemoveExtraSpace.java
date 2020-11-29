package ExercisePackage;

public class RemoveExtraSpace {

	public static void main(String[] args) {


		String str = "india    is   my  h        country   ";
		
		
		
		System.out.println(str.replace(" ", ""));
		
		str = str.replace("\\s+", " ");

		System.out.println(str);
	}

}
