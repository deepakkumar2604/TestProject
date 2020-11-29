package TestPAckage;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {


		
	     List<String> ListOfSubMenu ;
	        ArrayList<String> ListOfMenu = new ArrayList<String>();
	        ListOfMenu.add("Home");
	        ListOfMenu.add("Device Management Operation");
	        ListOfMenu.add("Model Information Management");
	        ListOfMenu.add("Firmware Management");
	        ListOfMenu.add("Config Info Management");
	        ListOfMenu.add("Display User Operation History");
	        ListOfMenu.add("Account Management");
	        ListOfMenu.add("Device Registration");
	        ListOfMenu.add("Device Registration Result Dialog");
	        ListOfMenu.add("Device type Info Management");
	        ListOfMenu.add("Edit Control SMS Parameter");
	        ListOfMenu.add("FOTA Flow Restriction");
	        System.out.println(ListOfMenu.size());
	        //System.out.println(ListOfMenu.remove(3));
	        ListOfSubMenu = ListOfMenu.subList(0, 4);
	        
	        System.out.println(ListOfMenu.size());
	        System.out.println(ListOfSubMenu.size()+1);
	        System.out.println(ListOfMenu.get(4));
	        
	}

}
