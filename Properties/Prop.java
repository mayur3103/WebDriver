package Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) throws Throwable {
		
		Properties Prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mayur\\eclipse-workspace\\JavaClasses\\src\\Myfile.properties");
		Prop.load(fis);
		System.out.println("My Name is ---" + Prop.getProperty("Name"));
		System.out.println("My EMP ID is ---" + Prop.getProperty("EMP_ID"));
		System.out.println("My Company is ---" + Prop.getProperty("Company"));
		System.out.println("City is ---" + Prop.getProperty("City"));

	}

}
