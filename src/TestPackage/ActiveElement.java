package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;

public class ActiveElement {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	/*TargetLocator switchTo = driver.switchTo();
	WebElement activeElement = switchTo.activeElement();
	activeElement.sendKeys("admin");*/
	//the above 3 lines in a single line
	driver.switchTo().activeElement().sendKeys("admin");
	//press CONTROL+P
	Robot r = new Robot();
	//press CONTROL
	r.keyPress(KeyEvent.VK_CONTROL);
	//press P
	r.keyPress(KeyEvent.VK_P);
	//Release P
	r.keyRelease(KeyEvent.VK_P);
	//Release CONTROL 
	r.keyRelease(KeyEvent.VK_CONTROL);
	}
}
