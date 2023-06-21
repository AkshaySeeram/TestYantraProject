package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath_Dep_Ind {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='newsletter-email']/following-sibling::span/preceding-sibling::input")).sendKeys("HI");
		driver.findElement(By.xpath("//span[@id='subscribe-loading-progress']/preceding-sibling::input")).click();
		Thread.sleep(3000);
		driver.close();
	}
}