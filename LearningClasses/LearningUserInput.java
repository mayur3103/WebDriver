package LearningClasses;

import java.util.Scanner;

public class LearningUserInput {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter the value of X");
		int X = S.nextInt();
		
		System.out.println("Enter the value of Y");
		int Y = S.nextInt();
		
		System.out.println("Sum is ---" + (X + Y));

	}

}
