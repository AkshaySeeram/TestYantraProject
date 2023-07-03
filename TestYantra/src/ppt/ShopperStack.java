package ppt;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(15000);
		driver.findElement(By.xpath("(//div[@class='star-ratings'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("compare")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		child.remove(parent);
		//driver.findElement(By.id("reload-button")).click();
		for (String wh : child) {
			driver.switchTo().window(wh);
			String text = driver.getTitle();
			if(text.contains("amazon"))
			{
				Thread.sleep(2000);
				driver.close();
			}
		}
	}	
}		