package TestPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScrollUpAndScrollDownJavacript {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://.seleniumhq.org./download/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	for(int i=0;i<5;i++)
	{
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
	}
	for(int i=0;i<5;i++)
	{
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		
	}
	driver.close();	
	
	
}
}
