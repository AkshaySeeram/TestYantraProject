package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath_A4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected());
		driver.findElement(By.xpath("//input[@id='pollanswers-2']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-2']")).isSelected());
		driver.findElement(By.xpath("//input[@id='pollanswers-3']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-3']")).isSelected());
		driver.findElement(By.xpath("//input[@id='pollanswers-4']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='pollanswers-4']")).isSelected());		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='vote-poll-1']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@id='block-poll-vote-error-1']")).getText());
		Thread.sleep(2000);
		driver.close();
	}
}