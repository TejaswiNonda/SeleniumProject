package TestPackage;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMultipleListBox {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("F://Listbox.html");
		WebElement listObj = driver.findElement(By.id("mtr"));
		Select s = new Select(listObj);
		System.out.println("List all the elements in Listbox");
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		System.out.println("*****they are*****");
		
			for(WebElement option:alloptions)
			{
				String text = option.getText();
				System.out.println(text);
			}
			System.out.println("select idly by Index");
			s.selectByIndex(0);
			System.out.println("select dosa by Value");
			s.selectByValue("d");
			System.out.println("select poori by VisibleText");
			s.selectByVisibleText("POORI");
			System.out.println("Print all the selected elements");
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		    for(WebElement option:alloptions)
			{
				String text = option.getText();
				System.out.println(text);
			}
		    System.out.println("print the first selected option");
		    WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		    System.out.println(firstSelectedOption2.getText());
		
		System.out.println("Deselect the idly by Index");
		s.deselectByIndex(0);
		System.out.println(s.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		System.out.println("deselect dosa by Value");
		s.deselectByValue("d");
		Thread.sleep(2000);
		System.out.println(s.getFirstSelectedOption().getText());
		System.out.println("deselect poori by VisibileText");
		s.deselectByVisibleText("POORI");
		System.out.println("multiple select Listbox or not");
		System.out.println(s.isMultiple()+"--It is multi select Listbox");
		//s.deselectByVisibleText("IDLY");
		driver.close();
	}	

}
