package QuestionSet1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Palindrome_Vowels {

     public static String display(String s) {
    	 
    	 StringBuffer sb = new StringBuffer(s);
    	 
    	 int k = 0;
    	 LinkedHashSet<Character> ll = new LinkedHashSet<Character>();
    	 
    	 String s2 = sb.reverse().toString();
    	 
    	 if(s2.equals(s)) {
    		 String s3 = s2.toLowerCase();
    		 
    		 for(int i = 0; i < s3.length(); i++) {
    			 
    			 ll.add(s3.charAt(i));
    		 }
    		 
    		Iterator<Character> it = ll.iterator();
    		while(it.hasNext()) {
    			char a = it.next();
    			
    			if(a == 'a' || a == 'e' || a == 'o' || a == 'u')
    				k++;
    		}
    	 }
    	 if (k >= 2)
    		 return "Valid";
    	 else
    		 return "Invalid";
    				 
		}
     
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(display(s));
	}

}
