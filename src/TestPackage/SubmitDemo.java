package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitDemo {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.cssSelector("[button[type= 'submit'][class='button buttonBlue']")).submit();
		Thread.sleep(20);
		driver.close();

	}
}
