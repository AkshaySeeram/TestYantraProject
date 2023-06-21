package Testng_testcases;



import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Login extends Base_Test{

	@DataProvider(name="testdata")
	public Object[][] dataDemo() {
		Object[][] data=new Object[1][2];
		data[0][0]="akshay@gmail.com";
		data[0][1]="akshay";

		return data;
	}
	@Test(dataProvider = "testdata")
	public void Login(String e,String pwd) throws InterruptedException {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(e);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.close();
	}
}
