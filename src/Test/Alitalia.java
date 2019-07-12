package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alitalia {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "E:\\Selenium Project\\WorkSpace\\LoginFb\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.alitalia.com/en_en/homepage.html");

	}

}