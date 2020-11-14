package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class ListenerClass extends AbstractWebDriverEventListener {
	
	public void afterClickOn(WebElement element, WebDriver driver) {
		
		System.out.println("Element Clicked");
	}
	
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		
		System.out.println("Successfully Navigated");
	}
	
	public void afterNavigateBack(WebDriver driver) {
		
		System.out.println("Moving Back");
	}
	
	public void afterNavigateForward(WebDriver driver) {
		
		System.out.println("Moving Forward");
	}

}
