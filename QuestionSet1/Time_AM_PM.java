package QuestionSet1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_AM_PM {

	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("hh.mm");
		String dateString = dateFormat.format(new Date()).toString();
		
		System.out.println("Current time in am/pm:" + dateString);
		
		DateFormat dateFormat2 = new SimpleDateFormat("dd/mm/yyyy hh.mm aa");
		String dateString2 = dateFormat2.format(new Date()).toString();
		
		System.out.println("Current date and time in am/pm:" + dateString2);

	}

}
