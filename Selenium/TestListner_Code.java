package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestListner_Code {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver webDriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webDriver);
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		ListenerClass listner = new ListenerClass();
		driver.register(listner);
		
		driver.findElement(By.xpath("//strong[text()='English']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
	}

}
