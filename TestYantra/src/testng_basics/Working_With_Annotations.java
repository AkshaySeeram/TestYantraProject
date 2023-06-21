package testng_basics;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Working_With_Annotations {

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Executing BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Executing AfterTest");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Executing BeforeClass");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Executing AfterClass");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Executing BeforeSuit");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Executing AfterSuite");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Executing BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Executing AfterMethod");
	}
	
	@Test
	public void Register() {
		System.out.println("Executing Test");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Random r=new Random();
		int num=r.nextInt(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		boolean radio_button = driver.findElement(By.id("gender-male")).isSelected();
		if (radio_button==true) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		driver.findElement(By.id("FirstName")).sendKeys("S");
		driver.findElement(By.id("LastName")).sendKeys("Akshay");
		driver.findElement(By.id("Email")).sendKeys("akshay"+num+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("akshay");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("akshay");
		driver.findElement(By.id("register-button")).click();
		System.out.println(driver.findElement(By.className("result")).getText());
		driver.close();
	}
}
