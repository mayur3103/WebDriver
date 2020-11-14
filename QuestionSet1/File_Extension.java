package QuestionSet1;

import java.io.File;

public class File_Extension {
	
	private static String getFileExtension(File file) {
		
		String extension = "";
		
		try {
			   
			   if(file != null && file.exists()) {
				String name = file.getName();
				extension = name.substring(name.lastIndexOf("."));
				
			}
		
		} catch (Exception e) {
			extension = "";
		}
		
		return extension;
	}
	
       public static void main(String[] args) {
		
		String extension = getFileExtension(new File("C:\\Users\\mayur\\myexcel.xls"));
		System.out.println("File Extension :" + extension);

  }
}
