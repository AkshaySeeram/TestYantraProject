package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/select.html");
		
		WebElement dropdown = driver.findElement(By.id("techskills"));
		Select sel=new Select(dropdown);
		//System.out.println(sel.isMultiple());
	}
	
}
