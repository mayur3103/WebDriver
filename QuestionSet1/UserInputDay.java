package QuestionSet1;

import java.util.Calendar;
import java.util.Scanner;

public class UserInputDay {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
		
		Calendar Cal = Calendar.getInstance();
		
		Cal.set(month, day, year);
		
	    switch(Cal.get(Cal.DAY_OF_WEEK))
		
		{
		case 1: System.out.println("Sunday");
		break;
		
		case 2: System.out.println("Monday");
		break;
		
		case 3: System.out.println("Tuesday");
		break;
		
		case 4: System.out.println("Wednesday");
		break;
		
		case 5: System.out.println("Thursday");
		break;
		
		case 6: System.out.println("Friday");
		break;
		
		case 7: System.out.println("Saturday");
		break;
		}
		

	}

}
