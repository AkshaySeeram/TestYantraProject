package Sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Handling_Mul_Win_A3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/MultipleWindow.html");
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(3000);
		Set<String> child_windows = driver.getWindowHandles();
		for (String win: child_windows) {
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
		}
		driver.quit();
	}
}