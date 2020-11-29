
public class maximum_minimum {

	public static void main(String[] args) {


		
		int num[] = {5,23,24,421,152,41};
		
		
		
		int max = num[0];
		int min = num[0];
		for(int i=0; i<num.length;i++) {
			if(max<num[i] ) {
				max = num[i];
			}
		}
		System.out.println(max);
		
		for(int i =0;i<num.length;i++) {
			if(min > num[i]) {
				min = num[i];
			}
		}System.out.println(min);
	}

}
