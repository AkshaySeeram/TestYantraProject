package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		driver.findElement(By.partialLinkText("Under")).click();
		driver.findElement(By.partialLinkText("1MP 60GB Hard")).click();
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
