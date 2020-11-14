package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_Selected {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Software Testing\\\\Automation Testing\\\\Pacematic_Automation\\\\WebDriver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//input[@id='radio0']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='radio1']")).isSelected());

	}

}
