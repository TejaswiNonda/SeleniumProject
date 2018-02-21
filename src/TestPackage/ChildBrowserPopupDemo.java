package TestPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		//number of browser windows
		driver.get("https://www.naukri.com/");
		String parentWH = driver.getWindowHandle();
			System.out.println("*****print number of brower windows*****");
		//print the window handle id for all browers
		Set<String> allWHs = driver.getWindowHandles();
		int size = allWHs.size();
		System.out.println("total number of browers is" +size);
		System.out.println("*******print window handle id for all browers*******");
		for(String wh:allWHs)
		{
			driver.switchTo().window(wh);
			System.out.println(wh);
			//print the title of all the browers
			String title = driver.getTitle();
			System.out.println(wh+"::::"+title);
			//close only parent browers
			//if(parentWH.equals(wh))
			//{
				//driver.close();
			//}
			//close all the child browsers not the parent browser
			//if(!parentWH.equals(wh))
			//{
				//driver.close();
			//}
			//close a specific window browser(in between)
			if(driver.getTitle().equals("Tech Mahindra"))
			{
				driver.close();
			}
			Thread.sleep(2000);
			//driver.close();
		}
		
		
		
	}
}
