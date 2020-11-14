package LearningClasses;

public class Learning_Exception02 {

	public static void main(String[] args) {
		
		System.out.println("Starting of Code");
		
		try {
			
			int i = 4 / 0;
			
			System.out.println(i);
			
		} catch (Throwable ae) {
			
			System.out.println("Ending of Code");
			
		}
		
		System.out.println("Post try catch");

	}

}
