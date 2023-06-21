package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Iframe_Using_Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/iframe.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.close();
	}
}