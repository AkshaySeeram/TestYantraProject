package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Parallel_Exe_With_DiffData {

	@DataProvider(name="testdata",parallel = true)
	public Object[][] dataDemo() {
		Object[][] data=new Object[2][2];
		data[0][0]="akshay@gmail.com";
		data[0][1]="akshay";

		data[1][0]="seeramakshay@gmail.com";
		data[1][1]="akshay123";
		
		return data;
	}
	
	@Test(dataProvider = "testdata")
	public void login(String e,String pwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(e);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.close();
	}
}
