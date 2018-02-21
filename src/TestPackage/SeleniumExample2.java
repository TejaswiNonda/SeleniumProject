package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://localhost:8080/login.do");
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("https://www.google.com");
		driver.navigate().back();
		Thread.sleep(20);
		driver.navigate().forward();
		Thread.sleep(20);
		driver.navigate().refresh();
		driver.close();
	}

}
