package TestPackage;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintinDuplicateValuesSorted_TreeSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("F://Listbox.html");
		WebElement listObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listObj);
		TreeSet<String> treeObj = new TreeSet<String>();
		List<WebElement> allOptions = s.getOptions();
		System.out.println(("*****Print Duplicate Item in the List*****"));
		for(WebElement option: allOptions)
		{
			String text = option.getText();
			if(!treeObj.add(text))
					{
				System.out.println(text);
					}
				}
		driver.close();
		
	}
}	
