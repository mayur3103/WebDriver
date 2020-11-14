package QuestionSet1;
    
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Print_Month08 {

public static void main(String[] args) throws Exception {

//  Format formatter = new SimpleDateFormat("23-01-2012"); 
//  String s = formatter.format(new Date());
//  System.out.println(s);
	   SimpleDateFormat simpleformat = new SimpleDateFormat("MMM");
	      String strMonth= simpleformat.format(new Date());
	      System.out.println("Month in MMM format = "+strMonth);

  
 }
}

