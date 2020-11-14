package QuestionSet1;

import java.util.Arrays;

public class CommonElements {
	
	public static void main(String[] args) {
		
		int sum= 0;
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {3, 4, 5, 6};
		
		System.out.println("Array1 : " + Arrays.toString(array1));
		System.out.println("Array2 : " + Arrays.toString(array2));
		
		for (int i = 0; i < array1.length; i++) {
			
			for (int j = 0; j < array2.length; j++) {
				
				if(array1[i] == array2[j]) {
					
			System.out.println("Common element is :" + (array1[i]));
			
			sum = sum+array1[i];
			
			System.out.println(sum);
			
				
	    }	
	
      }

		}
		
	}
	
}
		

	
	