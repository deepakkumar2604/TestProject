package ExercisePackage;

public class MoveAllZeros {

	public static void main(String[] args) {


        int arr[] = { 1, 0,0,1,0,1,0,1,0 };

       // System.out.println(arr.length);
        
        int count =0 ;
        
        for(int i =0 ; i<arr.length; i++) {
        	
        	
        	if(arr[i] != 0) {
        		arr[count++] = arr[i];
        	}
       
        	
        }
        
        
     	//System.out.println(count);
     	
     	while(count < arr.length) {
     		arr[count++] = 0 ;
     		
     	}
     	System.out.println(count);
     	for(int i =0 ; i<arr.length;i ++) {
     		System.out.print(arr[i]+ " ");
     	}
		
	}

}
