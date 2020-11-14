package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Captcha {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		String text = driver.findElement(By.xpath("//label[@id='ebcaptchatext']")).getText();
		System.out.println(text);
		System.out.println(text.substring(8, 9));
		System.out.println(text.substring(12, 13));
		
		int num1 = Integer.parseInt(text.substring(8, 9));
		int num2 = Integer.parseInt(text.substring(12, 13));
		
		int c = num1 + num2;
		String totalcount = String.valueOf(c);
		driver.findElement(By.xpath("//input[@id='ebcaptchainput']")).sendKeys(totalcount);
		
	}
	
}
		