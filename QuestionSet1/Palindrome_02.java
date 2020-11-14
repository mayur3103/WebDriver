package QuestionSet1;

public class Palindrome_02 {

	public static void main(String[] args) {
		
		String num1 = "101";
//		String num2 = "121";
		String rev = "";
		
		int count = num1.length();
//		int count1 = num2.length();
		
		for(int i = count - 1; i >=0; i--) {
			
			rev = rev + num1.charAt(i);
//			rev = rev + num2.charAt(i);
		}
		
		if(rev.equals(num1)) {
			
			System.out.println("Yes Palindrome");
		
//		} else if (rev.equals(num2)) {
//			
//			System.out.println("Yes Palindrome");	
		
		} else {
			
			System.out.println("NO");
		}

	}

}
