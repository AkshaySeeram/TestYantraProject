package testng_basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest_DataProvider_From_Excel {

	@DataProvider
	public String[][] TestData() throws EncryptedDocumentException, IOException {
		return Working_WIth_Excel_A2.multipleRead("Login");
	}
	
	@Test(dataProvider = "TestData")
	public void LoginTest(String Username,String pwd) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Log")).click();
		driver.findElement(By.id("Email")).sendKeys(Username);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.close();
	}
}
