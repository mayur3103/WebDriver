package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Java03 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Signin']")).click();
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset/input[@name='username']")).sendKeys("Automation");
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset/input[@name='password']")).sendKeys("Automation");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Alert']")).click();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElements(By.tagName("iframe")).get(1));
		System.out.println("Switched");
		driver.findElement(By.xpath("//button[text()='Click the button to demonstrate the Input box.']")).click();
		Thread.sleep(2000);
		
        Alert alert = driver.switchTo().alert();
        System.out.println("Switched to alert");
        System.out.println(alert.getText());
        
        alert.sendKeys("Mayur");
        Thread.sleep(5000);
        alert.accept();
        
        System.out.println("Accepted");
	}
	
}
		