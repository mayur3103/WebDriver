package QuestionSet1;

public class ReverseStringParse {

	public static void main(String[] args) {
		
		String name = "COMPUTER";
		int length = name.length();
		
		String Rev = " ";
		
		for(int i=length-1; i >=0; i--)
		{
			Rev = Rev+ " - " +name.charAt(i);
		}
		
//		String[] array = name.split("-",-1);
		
		System.out.println("Reverse of "+name+" is " +Rev);
		
	}

}
