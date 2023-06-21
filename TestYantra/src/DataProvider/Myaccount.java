package DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Myaccount {

	@DataProvider(name="testdata")
	public Object[][] dataDemo() {
		Object[][] data=new Object[1][2];
		data[0][0]="akshay@gmail.com";
		data[0][1]="akshay";
		
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void login(String e,String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.id("Email")).sendKeys(e);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.close();
	}
}