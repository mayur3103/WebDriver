package LearningClasses;

public class LearningException04 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Starting of Code");
		
		try {
			
			 int i = 10/5;
			 System.out.println(i);
		
		} catch (Throwable ae) {
			
			System.out.println("Ending of Code");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		 System.out.println("Post try catch");
		 
		 System.out.println("Hello Mayur");
		 
		 Thread.sleep(1000);

	}

}
