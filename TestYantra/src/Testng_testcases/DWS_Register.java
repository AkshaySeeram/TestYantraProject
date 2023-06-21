package Testng_testcases;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Register extends Base_Test{

	@DataProvider(name="TestData")
	public Object[][] testdata() {
		Object[][] data = new Object [1][5];
		data[0][0]="Akshay";
		data[0][1]="S";
		data[0][2]="akshay@gmail.com";
		data[0][3]="akshay";
		data[0][4]="akshay";
		
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void dataDemo(String Fn,String Ln,String E,String pwd,String cpwd) throws InterruptedException {
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
