package P;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed_Mul_Win {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();				
		driver.findElement(By.id("login-facebook-button")).click();				
		Set<String> window = driver.getWindowHandles();
		for (String win: window) {
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.close();
		}
	}
}