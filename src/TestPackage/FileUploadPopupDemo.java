package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		WebElement browseBtnObj = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		Thread.sleep(20);
		//to pass the absolute path directly to sendkeys press shift-> right click on file-> copy as path-> paste in argument
		//and put double backward slash or single forward everywhere
		browseBtnObj.sendKeys("C:\\Users\\Public\\Desktop\\Clean Master.lnk");
		driver.close();
	}

}
