package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_A2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement jobs = driver.findElement(By.xpath("//a[@title='Search Jobs']"));
		Actions action=new Actions(driver);
		action.moveToElement(jobs).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Jobs by skill')]"))).click().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'View all Top IT Skills')]"))).click().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Java Jobs')]"))).click().perform();
		Thread.sleep(6000);
		driver.quit();
	}
}