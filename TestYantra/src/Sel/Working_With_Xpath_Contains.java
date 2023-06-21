package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath_Contains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/xpath.html");
		driver.findElement(By.xpath("//input[contains(@type,'User')]")).sendKeys("HI");
		driver.findElement(By.xpath("//input[contains(@type,'Pass')]")).sendKeys("BYE");
		driver.findElement(By.xpath("//button[contains(text(),'On')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
}