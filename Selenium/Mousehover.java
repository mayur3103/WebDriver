package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

public class Mousehover {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software Testing\\Automation Testing\\Pacematic_Automation\\WebDriver\\chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);
		ListenerClass listner = new ListenerClass();
		EventFiringMouse mouse = new EventFiringMouse(webdriver, listner);
		driver.manage().window().maximize();
		driver.get("https://www.bankofbaroda.in/");
		
		////div[3]/div/div[1]/header/div[4]/div/ul/li[1]/ul/li[4]
		
		Locatable overitem = (Locatable) driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/header/div[4]/div/ul/li[1]/ul/li[4]/a"));	
		Coordinates cord = overitem.getCoordinates();
		mouse.mouseMove(cord);
		
		Locatable overitem1 = (Locatable) driver.findElement(By.xpath("/html/body/form/div[3]/div/div[1]/header/div[4]/div/ul/li[1]/ul/li[4]/ul/li[3]/a"));	
		Coordinates cord1 = overitem1.getCoordinates();
		mouse.mouseMove(cord1);

	}

}
