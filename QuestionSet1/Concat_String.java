package QuestionSet1;

public class Concat_String {
	
	static String testcase1 = "Mayur";
	static String testcase2 = "Ubale";
	
	public String join(String str1, String str2) {
		String str3= "";
		if(str1.length() >= str2.length()) {
			for(int i = 0; i < str1.length(); i++) {
				str3+= str2.charAt(i);
				for(int j=i; j<str2.length();) {
					str3+=str2.charAt(j);
					break;
				}
				
			}
		}
		
		else if(str2.length()>=str1.length()) {
			for(int i=0; i<str2.length(); i++) {
				str3+=str2.charAt(i);
				for(int j=i; j<str1.length();) {
					str3+=str1.charAt(j);
					break;
				}
			}
		}
		
		
		return str3;
	}
		
	
	public static void main(String[] args) {
		
		Concat_String testInstance = new Concat_String();
		String result = testInstance.join(testcase1, testcase2);
		System.out.println(result);
		
	}
}