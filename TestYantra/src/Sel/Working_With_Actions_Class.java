package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]"));	
		
		//creating object of actions class
		Actions action=new Actions(driver);
		action.moveToElement(computer).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"))).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement computer1 = driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]"));	
		action.moveToElement(computer1).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Accessories')])[1]"))).click().perform();
		Thread.sleep(3000);
		driver.close();
	}
}