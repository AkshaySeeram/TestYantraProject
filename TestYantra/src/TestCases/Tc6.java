package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();	
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Cell phones")).click();		
		Thread.sleep(3000);
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sortby);
		s.selectByVisibleText("Price: High to Low");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@alt='Picture of Used phone']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
