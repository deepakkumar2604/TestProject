package DemoPackage;

import java.util.Arrays;

public class DemoTest {

	public static void main(String[] args) {


		int[] num = {1,3,4,5,67,33};
		
		
		Arrays.sort(num);
	//	System.out.println(num[num.length-2]);
	
		int max= num[0];
		
		int Smax= num[0];
		
		for(int i=0;i<num.length;i++) {
			
		
			if(max < num[i]) {
				Smax = max;
				max = num[i];
			}
			else if(Smax < num[i]) {
				Smax = num[i];
			}
		}

		System.out.println(max);
		System.out.println(Smax);	
	}

}
