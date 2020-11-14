package LearningClasses;

public class LearningException_05 {

	public static void student(int StuAge, int StuWeight) throws Throwable {
		
		if (StuAge < 12 && StuWeight < 40) {
			
			throw new Exception("Student is not Eligible for the addmission");
		
		} else {
			
			System.out.println("Addmission is Sucessful");
			
		}
	}
	
	
	public static void main(String[] args) throws Throwable {
		
		student(15,20);
		

	}

}
