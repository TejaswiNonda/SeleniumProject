package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://localhost:8080/login.do");
		driver.getTitle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		WebElement obj = driver.findElement(By.id("username"));
		Thread.sleep(20);
		obj.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(20);
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		Thread.sleep(20);
		driver.findElement(By.linkText("View License")).click();
		Thread.sleep(20);
		driver.findElement(By.partialLinkText("View")).click();
		Thread.sleep(20);
		driver.findElement(By.xpath("//a[@id='licenseLink']")).click();
		Thread.sleep(20);
		driver.findElement(By.xpath("//a[contains(@id,'licenseLink']")).click();
		Thread.sleep(20);
		driver.close();

	}
}
