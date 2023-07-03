package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus_Train {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("pills-profile-tab")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("(//div[@class='label-container'])[1]/span")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='search-input']")).click();
		driver.findElement(By.xpath("//a[text()='NDLS  - New Delhi']")).click();


	}
}
