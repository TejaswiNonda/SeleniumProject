package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://www.cleartrip.com/");
		//inspect the calender pop up
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(20);
		//inspect date, it has link so can use linkText
		driver.findElement(By.linkText("31")).click();
		Thread.sleep(20);
		driver.close();
		}

}
