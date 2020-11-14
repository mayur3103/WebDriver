package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvent {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.xpath("//span[text()='Commons']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='ca-nstab-main']/a[text()='Main page']")).sendKeys(Keys.PAGE_DOWN);

	}

}
