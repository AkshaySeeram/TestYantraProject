package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		Actions action=new Actions(driver);
		action.moveToElement(search).click().sendKeys("Mobiles").perform();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		driver.quit();
	}
}