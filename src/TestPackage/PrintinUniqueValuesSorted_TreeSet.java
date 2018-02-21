package TestPackage;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintinUniqueValuesSorted_TreeSet {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("F://Listbox.html");
		WebElement listObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listObj);
		TreeSet<String> treeObj = new TreeSet<String>();
		List<WebElement> allOptions = s.getOptions();
		System.out.println(("*****unsorted order*****"));
		for(WebElement option: allOptions)
		{
			String text = option.getText();
			System.out.println(text);
			treeObj.add(text);
		}
		System.out.println(("*****print unique values in sorted order*****"));
		for(String text: treeObj)
		{
			System.out.println(text);
		}
		driver.close();
	}
}	
