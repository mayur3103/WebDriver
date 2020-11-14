package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_01 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeevansathi.com/");
		
		try {
			
			driver.findElement(By.xpath("//div[@id='relatio']")).click();
		
		} catch(Exception ae) {

          File obj = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          FileUtils.copyFile(obj, new File("C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\Selenium\\ScreenShot\\Screen_02.png"));
          System.out.println("Test case Failed, Screen shot captured");
			
		}

	}

}
