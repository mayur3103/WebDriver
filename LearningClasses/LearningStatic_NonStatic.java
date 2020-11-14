package LearningClasses;

public class LearningStatic_NonStatic {

	public static void staticmethod() {
		
		System.out.println("Rudra is Good Boy");
	}
	
	public static void nonstaticMethod() {
		
		System.out.println("Rudra is Clever Boy");
	}
	
	public static void main(String[] args) {
		
		LearningStatic_NonStatic obj = new LearningStatic_NonStatic();
		staticmethod();
		obj.nonstaticMethod();
	}
}
