package Sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Handling_Mul_Win_A1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(5000);
		Set<String> child = driver.getWindowHandles();
		for (String win: child) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if(title.contains("Facebook")) {
				driver.close();
			}
		}
	}
}