package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchingBrowser_02 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mayur Ubale");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9960603103");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mayurubale999@gmail.com");
		Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		dropdown.selectByIndex(5);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[@id='login']/form/fieldset/input[@name='username']")).sendKeys("mayur_01");
		driver.findElement(By.xpath("//div[@id='load_box']/form/fieldset/input[@name='password']")).sendKeys("9960603103");
		
		
//		dropdown.selectByVisibleText("Algeria");
//		dropdown.selectByValue("Australia");
		
//		List<WebElement> countryOptions = dropdown.getOptions();
//		System.out.println(countryOptions.size());
//		
//		for(int i = 0; i <= countryOptions.size(); i++) {
//			
//			System.out.println(countryOptions.get(i).getText());
//			System.out.println(countryOptions.get(i).getAttribute("value"));
			
		}		
		
	}


