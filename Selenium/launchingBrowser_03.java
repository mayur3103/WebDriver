package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser_03 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement> links = driver.findElements(By.tagName("body"));
		System.out.println(links.size());		
		
		for(int i = 0; i < links.size(); i++) {
			
//			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("id"));
		}

	}
	
}


