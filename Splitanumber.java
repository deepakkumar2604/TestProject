import java.util.ArrayList;
import java.util.List;

public class Splitanumber {

	public static void main(String[] args) {

	
		
		strsplit ("99999999998888888888");
		
		}
	
	
public static String strsplit(String text) {
		
		List<String> strings = new ArrayList<String>();
		int index = 0;
		while (index < text.length()) {
		    strings.add(text.substring(index, Math.min(index + 10,text.length())));
		    index += 10;
		
		}
		return text;
	}
}
