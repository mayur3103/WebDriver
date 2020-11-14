package QuestionSet1;

import java.util.Scanner;

public class Palindrome_Sum {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer > 0:");
		Scanner keyboard = new Scanner(System.in);
		
		int palindrome = keyboard.nextInt();
//		int palindrome1 = palindrome;
		int num;
		int sum;
		
		int rev = 0;
		
		if(palindrome<=0) {
			
			System.out.println("You must enter an integer greater than zero");
		}
		
         while(palindrome!=0) {
        	 
        	 rev=(rev*10) + (palindrome % 10);
        	 
        	 palindrome = palindrome /10;
//        	 System.out.println("the integer" + palindrome1 + "is a palindrome");
         }
         
         if(palindrome == rev) {
        	 
        	 System.out.println("palindrome");
        
         } else {
        	 
        	 System.out.println("not");
         }
         
//         num = 1;
//         sum = 0;
//         
//         while(num <= palindrome1) {
//        	 sum = sum + num;
//        	 num++;
//        	 System.out.println(sum);
        	 
         }
	}

