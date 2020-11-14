package QuestionSet1;

import java.util.Arrays;

public class LarrgestDifferenceGap {

	public static void main(String[] args) {
		
		int[] myArray = {2, 3, 4, 2, 3};
		
		System.out.println("Array:" + Arrays.toString(myArray));
		
		int min = myArray[2];
		int max = myArray[4];
		
		for(int i = 1; i < myArray.length; i++) {
			
			if(min > myArray[i])
				min = myArray[i];
			if(max < myArray[i])
				max = myArray[i];
		}
		
		System.out.println("Difference between largest and smallest value of the Array:" + (max - min));
		

	}

}
