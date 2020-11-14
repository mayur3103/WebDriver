package LearningClasses;

public class LearningException03 {

	public static void main(String[] args) {
		
		System.out.println("Starting of Code");
		
		try {
			  int i = 10 / 0;
			  System.out.println(i);
		
		} catch (Throwable ae) {
			
			System.out.println("Ending of Code");
			System.out.println(ae.getMessage());
		}
		
		System.out.println("Post try Catch");

	}

}
