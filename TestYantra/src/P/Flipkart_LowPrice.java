package P;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_LowPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[1]")).click();
		Set<String> childwindow = driver.getWindowHandles();
		
		for(String wh:childwindow) {
			driver.switchTo().window(wh);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("redmi note 12 pro plus"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'REDMI Note 12')])[1]")).click();
		Set<String> childwindow1 = driver.getWindowHandles();
		
		for(String wh:childwindow1) {
			driver.switchTo().window(wh);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("realme 10 pro plus"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'realme 10 Pro')])[1]")).click();
		Set<String> childwindow2 = driver.getWindowHandles();
		
		for(String wh:childwindow2) {
			driver.switchTo().window(wh);
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//div/a[contains(text(),'realme')]/../..//span[2]")).getText();
		String price1 = driver.findElement(By.xpath("//div/a[contains(text(),'REDMI')]/../..//span[2]")).getText();
		String price2 = driver.findElement(By.xpath("//div/a[contains(text(),'APPLE')]/../..//span[2]")).getText();

		if(price.hashCode()<price1.hashCode()&& price.hashCode()<price2.hashCode()) {
			driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
			System.out.println(" price Is removed ");
		}

		if(price1.hashCode()<price.hashCode()&& price1.hashCode()<price2.hashCode()) {
			driver.findElement(By.xpath("(//div[text()='Remove'])[2]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
			System.out.println(" price 1 Is removed ");
		}
 
		if(price2.hashCode()<price.hashCode()&& price2.hashCode()<price1.hashCode()) {
			driver.findElement(By.xpath("(//div[text()='Remove'])[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//div[text()='Remove'])[1]")).click();
			System.out.println(" price 2 Is removed ");
		}
		Thread.sleep(3000);
		driver.quit();	
	}
}