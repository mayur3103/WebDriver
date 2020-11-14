package QuestionSet1;

import java.time.LocalDate;
import java.time.Period;

public class Number_of_Months {

	public static void main(String[] args) {
		
		LocalDate day = LocalDate.of(2012, 01, 03);
		LocalDate day1 = LocalDate.of(2012, 12, 01);
		
		Period duration = Period.between(day,day1);
		int years = duration.getYears();
		int months = duration.getMonths();
		
		System.out.println("number of years:" + years);
		System.out.println("number of months:" + months);
		

	}

}
