
public class Encap {

	private int age;
	private String name;
	private String state;

	public void setage(int age) {
		this.age = age;
	}

	public void setname(String newname) {
		name = newname;
	}

	public void setstate(String newstate) {
		state = newstate;
	}

	public int getage() {
		return age;
	}

	public String getname() {
		return name;
	}

	public String getstate() {
		return state;
	}



	public static void main(String[] args) {

		Encap encap = new Encap();
		encap.setage(24);
		encap.setname("DEepak");
		encap.setstate("TN");
	
	
		
		System.out.println(encap.getage());
		System.out.println(encap.getname());
		System.out.println(encap.getstate());
		
	}
	
	
	
	
	
}