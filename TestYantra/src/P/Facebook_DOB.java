package P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DOB {

	public static void main(String[] args) throws Exception {
		ScreenRecorderUtil.startRecord("Facebook");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
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
		driver.findElement(By.xpath("//input[@value=2]")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(10000);
		ScreenRecorderUtil.stopRecord();
		driver.close();
	}
}