
public class MehodOverloading {

	public static void main(String[] args) {


		
	}

	
	
	public void sum() {
		System.out.println("Sum method ");
	}
	
	public void sum(int a) {
		System.out.println("Sum method "+ a);
	}
	public void sum(int a, int b) {
		System.out.println("Sum method "+ a+b);
		
	}
	public void sum(String a, int b) {
		System.out.println("Sum method "+ a+b);
		
	}
}
