package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronics = driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));	
		Actions action=new Actions(driver);
		action.moveToElement(electronics).build().perform();
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Cell phones')])[1]"))).click().perform();
		Thread.sleep(2000);
		driver.close();
	}
}