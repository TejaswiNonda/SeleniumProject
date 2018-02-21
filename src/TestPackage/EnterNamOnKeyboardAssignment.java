package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.glass.events.KeyEvent;


public class EnterNamOnKeyboardAssignment {
	public static void main(String[] args) throws AWTException,InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.switchTo().activeElement();
		//create object for robot class
		Robot ro = new Robot();
		//press key
		ro.keyPress(KeyEvent.VK_T);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_T);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_E);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_E);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_J);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_J);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_A);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_A);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_S);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_S);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_W);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_W);
		Thread.sleep(20);
		//press key
		ro.keyPress(KeyEvent.VK_I);
		Thread.sleep(20);
		//release key
		ro.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		driver.close();
	}
}
