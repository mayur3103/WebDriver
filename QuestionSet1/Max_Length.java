package QuestionSet1;

import java.util.Arrays;
import java.util.Comparator;

public class Max_Length {

	public static void main(String[] args) {
		
		String s = "Hello how are you aaaaa";
		
		System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparing(String :: length)).orElse(null));
	}
	
}
