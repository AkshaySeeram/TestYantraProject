package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_JavaScript_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/linux/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,3000);");
	}
}