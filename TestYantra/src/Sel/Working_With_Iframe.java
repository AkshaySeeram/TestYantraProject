package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		driver.close();
	}
}