package QuestionSet1;

public class Concat_String001 {
	
	public String minCat(String St1, String St2)
	
	{
		if (St1.length() == St2.length())
			return St1 + St2;
		if(St1.length() > St2.length())
		{
			int diff = St1.length() - St2.length();
			return St1.substring(diff, St1.length()) + St2;
		
		} else {
			
			int diff = St2.length() - St1.length();
			return St1 + St2.substring(diff, St2.length());
		}
	}
	
	public static void main(String[] args) {
		
		Concat_String001 m = new Concat_String001();
		
		String Str1 = "Hello";
		String Str2 = "Hi";
		
		System.out.println("The Given String is: " + Str1+" and " + Str2);
		System.out.println("The new String is: " +m.minCat(Str1, Str2));
	}
	
   }

