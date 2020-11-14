package LearningClasses;

public class LearningMethodArug {

	// Void Method
	// Single Arug
	// Multi Arug
	
	public void addition() { //void arug method
		
		int X = 500;
		int Y = 500;
		
		System.out.println("Addition is ---" + (X + Y));
	}
	
	public void addition(int X) { //Single Arug Method
		
		System.out.println("Argument number is ---" + (X));
	}
	
	public void addition(int X, int Y, int Z) {// Multi Arug Method
		
		System.out.println("X is ---" + (X));
		System.out.println("Y is ---" + (Y));
		System.out.println("Z is ---" + (Z));
	}
	
	public static void main(String[] args) {
		
		LearningMethodArug obj = new LearningMethodArug();
		obj.addition();
		obj.addition(500000);
		obj.addition(500, 1000, 2000);
	}
}
