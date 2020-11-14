package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton_01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/radio.html");
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radio.get(0).getAttribute("checked"));
		driver.findElement(By.xpath("//input[@id='vfb-7-2']")).click();
		System.out.println(radio.get(1).getAttribute("checked"));

	}

}
