package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();

	}

}s
