package org.alitalia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alitalia {
	
	public static void 
(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUTHAKAR\\eclipse-workspace\\SecondProgram\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.alitalia.com/en_en/homepage.html");
		driver.manage().window().maximize();
		//Searching flight
		WebElement srchClick = driver.findElement(By.id("main_search"));
		srchClick.click();
		WebElement search = driver.findElement(By.id("search-bar__input"));
		search.sendKeys("Chennai to Delhi");
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ok.click();
		driver.findElement(By.xpath("(//span[contains(text(),'International')])[2]"));
		System.out.println("Button clicked.............");
		System.out.println("hhhh");
		System.out.println("bala");
		System.out.println("karthi");
		System.out.println("bba");
		System.out.println("rose");
	}

}
