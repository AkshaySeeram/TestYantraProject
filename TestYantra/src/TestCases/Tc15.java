package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Camera, photo")).click();
		Thread.sleep(3000);
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sortby);
		s.selectByVisibleText("Name: Z to A");
		Thread.sleep(3000);
		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select s1=new Select(display);
		s1.selectByVisibleText("12");
		Thread.sleep(3000);
		WebElement view= driver.findElement(By.id("products-viewmode"));
		Select s2=new Select(view);
		s2.selectByVisibleText("List");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("1MP 60GB Hard")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
