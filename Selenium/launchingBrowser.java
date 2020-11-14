package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
