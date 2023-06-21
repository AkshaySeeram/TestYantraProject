package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Camera, photo")).click();	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("1MP 60GB Hard")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FriendEmail")).sendKeys("testyantra@gmail.com");
		driver.findElement(By.id("YourEmailAddress")).sendKeys("akshay@gmail.com");
		driver.findElement(By.name("send-email")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
