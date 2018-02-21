package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_SuggestionsSeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("https://www.google.com");
		//inspect on google empty text box and get id value
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		//if you dont give thread it will give empty object and count will be zero so use thread
		Thread.sleep(5000);
		String xp ="//*[contains(text(),'selenium')]";
		List<WebElement> allOptions = driver.findElements(By.xpath(xp));
		int count = allOptions.size();
		System.out.println(count);
		//print all the auto suggestions options-> use for each loop
		for(WebElement option:allOptions)
		{
			String text = option.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("selenium interview questions"))
			{
				option.click();
				//to come out of loop(only 3 elements will be printed) and if you dont put break it will throw an exception
				break;
			}
		}
		driver.close();
		

		
		
	}

}
