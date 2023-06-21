package Sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Facebook_HiddenElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Akshay");		
		driver.findElement(By.name("lastname")).sendKeys("Chandra");		
		driver.findElement(By.name("reg_email__")).sendKeys("akshayseeram@gmail.com");		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("akshayseeram@gmail.com");		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Akshay@2393");
		WebElement day = driver.findElement(By.id("day"));	
		Select d=new Select(day);
		d.selectByIndex(21);
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));	
		Select m=new Select(month);
		m.selectByVisibleText("Feb");
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.id("year"));	
		Select y=new Select(year);
		y.selectByValue("2001");
		WebElement custom = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Hello';",custom);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='sex'])[3]")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
