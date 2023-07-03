package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Multi_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/select.html");
		WebElement dropdown = driver.findElement(By.id("techskills"));
		Select sel=new Select(dropdown);
		Thread.sleep(2000);
		sel.selectByValue("javascript");
		sel.selectByIndex(5);
		sel.selectByVisibleText("HTML");

		Thread.sleep(3000);
		
//		sel.deselectByValue("javascript");
//		sel.deselectByIndex(5);
//		sel.deselectByVisibleText("HTML");
		
		sel.deselectAll();
		
	}
	
}
