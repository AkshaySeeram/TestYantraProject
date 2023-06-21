package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Actions a = new Actions(driver);
		WebElement resources =driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(resources).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String phno =driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]")).getText();
		System.out.println(phno);
		driver.close();
	}
}
