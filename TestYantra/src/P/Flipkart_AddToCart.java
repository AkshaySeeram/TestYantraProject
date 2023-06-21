package P;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AddToCart {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("Flipkart");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		Thread.sleep(3000);
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		sugg.get(1).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone')])[1]")).click();
		Set<String> handle = driver.getWindowHandles();		
		for (String wh: handle) {
			driver.switchTo().window(wh);
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		ScreenRecorderUtil.stopRecord();
		driver.quit();
	}
}