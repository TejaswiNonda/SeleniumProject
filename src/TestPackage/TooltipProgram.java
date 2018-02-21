package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.sun.glass.events.KeyEvent;

public class TooltipProgram {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://localhost:8080/login.do");
		//driver.findElement(By.xpath("[for='keepLoggedInCheckBox'][id='keepLoggedInLabel']"));
		Thread.sleep(20);
		//driver.findElement(By.xpath("[title ='Do not select if this computer is shared']"));
		Thread.sleep(20);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(20000000);
		driver.close();
	}

}
