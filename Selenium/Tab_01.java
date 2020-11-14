package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_01 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airbnb.co.in/india/stays");
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//a[@aria-label='Homes Comfortable places with all the essentials']")).click();
		Set<String> winIds = driver.getWindowHandles();
		Iterator<String> itr = winIds.iterator();
		
		String firstWin = itr.next();
		String secondWin = itr.next();
		
		System.out.println(firstWin);
		System.out.println(secondWin);
		driver.switchTo().window(secondWin);
		Thread.sleep(20000);

	}

}
