package testng_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_With_Data_Provider {

	@DataProvider(name="TestData")
	public Object[][] testdata() {
		Object[][] data = new Object [4][5];
		data[0][0]="Akshay";
		data[0][1]="S";
		data[0][2]="akshay@gmail.com";
		data[0][3]="akshay";
		data[0][4]="akshay";
		
		data[1][0]="Anirudh";
		data[1][1]="B S";
		data[1][2]="anirudh@gmail.com";
		data[1][3]="anirudh";
		data[1][4]="anirudh";
		
		data[2][0]="Vamsi";
		data[2][1]="A";
		data[2][2]="vamsi@gmail.com";
		data[2][3]="vamsi";
		data[2][4]="vamsi";
		
		data[3][0]="Prajith Sai";
		data[3][1]="S";
		data[3][2]="prajithsai@gmail.com";
		data[3][3]="prajith";
		data[3][4]="prajith";
		
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void dataDemo(String Fn,String Ln,String E,String pwd,String cpwd) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys(Fn);
		driver.findElement(By.id("LastName")).sendKeys(Ln);
		driver.findElement(By.id("Email")).sendKeys(E);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		Thread.sleep(3000);
		driver.close();
	}
	
}