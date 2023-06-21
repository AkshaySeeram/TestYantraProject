package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_JavaScript_DisableClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.xpath("(//a[@rel='lightbox'])[2]")).click();
		WebElement diabledbutt= driver.findElement(By.xpath("//a[contains(text(),'Download jdk-8u371-linux')]"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();",diabledbutt);
	}
}