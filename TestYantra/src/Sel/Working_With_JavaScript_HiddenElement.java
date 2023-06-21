package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_JavaScript_HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);		
		driver.findElement(By.id("hide-textbox")).click();
		WebElement hiddenele= driver.findElement(By.id("displayed-text"));
		
		Thread.sleep(2000);

		js.executeScript("arguments[0].value='Hello';",hiddenele);
		driver.findElement(By.id("show-textbox")).click();
		
		
	}
}
