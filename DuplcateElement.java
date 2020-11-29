import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplcateElement {

	public static void main(String[] args) {


	String[] names = {"deepak", "kumar", "Sandeep", "deepak", "Anand"};
	
	
	int len = names.length;
	System.out.println(len);
	for(int i =0;i<len; i++ ) {
		for(int j =i+1;j<len;j++) {
			
			if(names[i]==(names[j])) {
				System.out.println(names[j]);
			}
		}
	}
	
	Set set = new HashSet();
	
	for(String name: names) {
	
		if(	set.add(name)==false) {
	System.out.println(name);
}

;

	
	
	
	}
	}

}
