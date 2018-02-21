package TestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://localhost:8080/login.do");
		//to get list of all Links("//a")
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		//to get count of total links available
		//int count = allLinks.size();
		int totallinkcount= allLinks.size();
		//to get visible link's count
		int visiblelinkcount=0;
		System.out.println(totallinkcount);
		//for each loop
		for(WebElement link : allLinks)
		{
			String text = link.getText();
			System.out.println(text);
			if(link.isDisplayed())
					{
				System.out.println(text);
				visiblelinkcount++;
					}
			//if particular link with text is present or not
			if(text.equals("View License"))
			{
				// to click on link
				link.click();
				Thread.sleep(2000);
			}
		}
	
	//print the visible number of link's count
	System.out.println("Total  number of visible links is:" +visiblelinkcount);
	System.out.println("Invisible links count is:"+(totallinkcount-visiblelinkcount));
	Thread.sleep(20);
	driver.close();
	}

}
