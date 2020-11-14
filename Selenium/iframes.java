package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Software Testing\\\\Automation Testing\\\\Pacematic_Automation\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(5000);
		driver.switchTo().frame("iframeResult");
		System.out.println("Switched");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();

	}

}
