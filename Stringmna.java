
public class Stringmna {

	public static void main(String[] args) {


	String count = "1(2)";
	
	
	String str = count.substring(2, 3);
	
	System.out.println(str+"*******************");
	
	System.out.println("*******************");
	
	String beforesplit = count.replace("(", ":");
	
	System.out.println(count.replace("(", ":"));
	
	System.out.println(count.replace(")", ":"));
	
	String[] aftersplit = beforesplit.split(":");
	
	System.out.println(aftersplit[0]);

	System.out.println(aftersplit[1]);
	
	}

}
