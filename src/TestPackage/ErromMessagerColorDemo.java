package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ErromMessagerColorDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//launch the actitime url
		driver.get("http://localhost:8080/login.do");
		//click on login button
		driver.findElement(By.xpath("div[(text()='Login ')]")).click();
		//print the error message
		String xp = "span[contains(text(),'invalid']";
		  WebElement errorMsg = driver.findElement(By.xpath(xp));
		  String text = errorMsg.getText();
		  System.out.println(text);
		//check the error message is in Red color or not
		  String errColor = errorMsg.getCssValue("color");
		  System.out.println(errColor);
		  String hexaColor = Color.fromString(errColor).asHex();
		  System.out.println(hexaColor);
		  if(hexaColor.equals("#ce0100"))
		  {
			  System.out.println("Red- Valid Color");
			  
		  }
		  else
		  {
			  System.out.println("Invalid color");
		  }
		driver.close();
	}

}

