package ExercisePackage;

import java.util.ArrayList;
import java.util.Arrays;

public class DupliacteInArraylist {

	public static void main(String[] args) {

		   ArrayList<String>  list = new ArrayList<>();
	       

				   ArrayList<String>  list1 = new ArrayList<>();
			   	   
		Arrays.asList("Dev", "Labs", "Alliance", "Dev", "Labs", "Dev", "DevLabsAlliance");

		   
		   ArrayList<String> newList = new ArrayList<String>();
		   
		   
		for(int i =0 ; i<list1.size();i++) {
			System.out.println(list1.get(i));
			
			
			if(!newList.contains(list.get(i))) {
				newList.add(list.get(i));
			}
	}
		System.out.println("************");
		
		for(int i =0 ; i<newList.size();i++) {
			System.out.print(newList.get(i)+ " ");
		
		   
	}

}
}