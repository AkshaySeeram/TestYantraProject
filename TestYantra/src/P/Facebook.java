package P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("BYE");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}