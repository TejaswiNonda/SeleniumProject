package TestPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlertPopup_UsingAlertInterface {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//f12 or ctrl+shift+I for inspect as for popup we cannot right click
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		String text = alert.getText();
		System.out.println("Text present on alert popoup is" +text);
		//handle UnhandledAlertException
		//driver.findElement(By.id("username")).sendKeys("TEJU");(UnhandledAlertException)
		alert.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
