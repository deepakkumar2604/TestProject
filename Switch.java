
public class Switch {

	public static void main(String[] args) {
	
		
		String option = "Black List";
		String value = null ;
		switch (option) {
		case "Change mode":
				value = "change_mode";
			break;
		case "Black List":
			value =  "change_black_list" ;
			break;
		case "View TACs":
			value = "view_tac";
			break;
		case "Get OSV File":
			value = "getosv_file";
			break;		
		}
	
		
	System.out.println(value);	
		
	}

}
