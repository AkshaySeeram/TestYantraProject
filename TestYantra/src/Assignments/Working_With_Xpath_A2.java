package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath_A2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("akshay0011@gmail.com");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@id='newsletter-result-block']")).getText());
		Thread.sleep(2000);		
		driver.close();
	}
}
