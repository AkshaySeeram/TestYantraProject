package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframe_Using_Webelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/iframe.html");
		WebElement frame = driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();
	}
}