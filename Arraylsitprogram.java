package DemoPackage;

public class Arraylsitprogram {

	public static void main(String[] args) {


		
		int num[] = {1,4,5,23,45};
		
		
		int max = 0;
		
		for(int i =0; i<num.length;i++) {
			
			if(max < num[i]) {
				max = num[i];
			}
			
		}
		System.out.println(max);
		
	}

}
