package org.greens.tec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\LoginFb\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
		
	public static void enterUrl(String url) {
		driver.get(url);
		
		
	}
		
public static void closebrowser() {
	
	driver.close();

}

public static void currenturl() {
	 String hm = driver.getCurrentUrl();
	 System.out.println(hm); 

}
	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}	
	
	public static void enterText(WebElement element, String name) {
		
		element.sendKeys(name);
	}
	
	public static void buttonClick(WebElement element) {
		element.click();
	}
	
		public static void gettingText(WebElement String) {
	
			getText();
   
		}	

	

	private static void getText() {
		// TODO Auto-generated method stub
		
	}

	}

