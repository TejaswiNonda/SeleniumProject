package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver =  new ChromeDriver(); 
			driver.get("http://isqtb.in/");
			Thread.sleep(2000);
			WebElement foundation = driver.findElement(By.xpath("//span[text()='FOUNDATION')])"));
			Actions action = new Actions(driver);
			action.moveToElement(foundation).perform();
			driver.close();
					

		}
}
