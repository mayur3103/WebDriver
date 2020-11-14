package LearningClasses;

import java.util.Scanner;

public class LearningCalculations {

	public static void main(String[] args) {
		
		LearningCalculations obj = new LearningCalculations ();
		
		obj.addition();
		obj.substraction();

	}
	
	public static void addition () {
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("Enter the value of X");
		int X = S.nextInt();
		
		System.out.println("Enter the value of Y");
		int Y = S.nextInt();
		
		System.out.println("Addition is ---" + (X + Y));
		
	}
	
	public static void substraction () {
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("Enter the value of X");
		int X = S.nextInt();
		
		System.out.println("Enter the value of Y");
		int Y = S.nextInt();
		
		System.out.println("Substraction is ---" + (X - Y));
		
	}

}
