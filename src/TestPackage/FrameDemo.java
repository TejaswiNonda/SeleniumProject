package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("F:/Frame_Page2.html");
		WebElement frameobj = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(frameobj);
		driver.findElement(By.id("t1")).sendKeys("admin12345");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		//driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("manager12345");
		Thread.sleep(2000);
		driver.close();

	}
}
