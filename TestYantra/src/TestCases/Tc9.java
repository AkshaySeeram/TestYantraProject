package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Over")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("High Definition 3D Camcorder")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
