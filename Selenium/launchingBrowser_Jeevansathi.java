package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser_Jeevansathi {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeevansathi.com/");
		driver.findElement(By.xpath("//div[@id='relationship']")).click();
		driver.findElement(By.xpath("//li[@value='6D']")).click();
		driver.findElement(By.xpath("//input[@data-qa='email']")).sendKeys("mayurubale999@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='mobileNo.']")).sendKeys("9960603103");

	}

}
