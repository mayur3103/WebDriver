package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable02 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(5000);
		List<WebElement> row = driver.findElements(By.xpath("//tbody/tr/td/a"));
		System.out.println(row.size());
		List<WebElement> col = driver.findElements(By.xpath("//table/thead/tr/th"));
		System.out.println(col.size());
		
		//tbody/tr[3]/td[4]
		
		String First = "//tbody/tr[";
		String Mid = "]/td[";
		String Last = "]";
		
		for(int i = 1; i <= row.size(); i++) {
			
			for(int j = 1; j <= col.size(); j++) {
				
				WebElement table = driver.findElement(By.xpath(First + i + Mid + j + Last));
				System.out.print(table.getText() + "||");
				
			}
			
			System.out.println();
		}

	}

}
