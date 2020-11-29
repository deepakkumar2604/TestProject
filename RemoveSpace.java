package ExercisePackage;

import java.util.StringTokenizer;

public class RemoveSpace {

	public static void main(String[] args) {

	
	
	String str = "Indian    emconumu ios    best encomay  ";
	
	System.out.println(str.replaceAll(" ", ""));
	//2nd method
	String upodated = str.replaceAll("\\s+", " ");
	System.out.println(upodated.trim());
	
	//3rd method 

	StringTokenizer st = new StringTokenizer(str, " ");
	StringBuffer sb = new StringBuffer();
	
	while(st.hasMoreElements()) {
		sb.append(st.nextElement()).append(" ");
	}
	
	System.out.println(sb.toString().trim());
	
	
	
	
	
	
	
	
	}

}
