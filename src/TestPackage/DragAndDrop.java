package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver(); 
		driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement srcblock1 = driver.findElement(By.xpath("//h1[text()='Block 1'])"));
		WebElement destblock3 = driver.findElement(By.xpath("//h1[.='Block 3])"));
		Actions action = new Actions(driver);
		action.dragAndDrop(srcblock1, destblock3).perform();
		//Assignment to move the block to an empty place using dragAndDropBy() method
		action.dragAndDropBy(srcblock1,50, 100);
		driver.close();
		
		
	}

}
