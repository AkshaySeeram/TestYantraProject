package Testng_testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Contact_Us extends Base_Test{

	@Test
	public void Contactus() throws InterruptedException {
		driver.findElement(By.linkText("Contact us")).click();
		driver.findElement(By.id("FullName")).sendKeys("Akshay");
		driver.findElement(By.id("Email")).sendKeys("Akshay@gmail.com");
		driver.findElement(By.id("Enquiry")).sendKeys("HI - BYE");
		driver.findElement(By.name("send-email")).click();
		Thread.sleep(3000);
	}
}
