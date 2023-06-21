package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sortby);
		s.selectByVisibleText("Name: A to Z");
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select s1=new Select(display);
		s1.selectByVisibleText("4");
		driver.findElement(By.partialLinkText("1MP 60GB Hard")).click();
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		driver.findElement(By.id("FriendEmail")).sendKeys("testyantra@gmail.com");
		driver.findElement(By.id("YourEmailAddress")).sendKeys("akshay@gmail.com");
		driver.findElement(By.name("send-email")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
