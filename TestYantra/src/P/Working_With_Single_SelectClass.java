package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Single_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/books");
		WebElement dropDown = driver.findElement(By.id("products-orderby"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(2);
		
		dropDown = driver.findElement(By.id("products-orderby"));
		sel=new Select(dropDown);
		
		WebElement option = sel.getFirstSelectedOption();
		System.out.println(option);
		Thread.sleep(3000);
		driver.close();
	}
}