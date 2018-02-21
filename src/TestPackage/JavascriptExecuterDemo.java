package TestPackage;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterDemo {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8080/login.do");
			JavascriptExecutor js = (JavascriptExecutor) driver;

			String jsStatement = "document.getElementById('username').value='tejaswi'";//inspect->console->document.getElementById
			js.executeScript(jsStatement);
			driver.close();
		}
	}

