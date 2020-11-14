package QuestionSet1;

import java.util.Scanner;

public class Array_HighestMarks {
	
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		double[] marks = new double[10];
		String[] names = new String[10];
		
		double max;
		int i;
		
		for(i=0; i<3; i++) {
		
			System.out.println("Enter the name of Student:");
			names[i] = (S.nextLine());
			System.out.println("Enter Marks:");
			marks[i] = S.nextDouble();
			S.nextLine();
			
		}
		
		int position = 0;
		max = marks[i];
		for(i = 0; i < 3; i++) {
			if(max < marks[i]) {
				max = marks[i];
				position = i;
			}
			
		}
		
		System.out.println("Highest Marks:" + marks[position] + "Student name" + names[position]);
	}
	
}
	
