package Testng_testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Subscribe extends Base_Test{

	@Test
	public void Subscribe() {
		driver.findElement(By.id("newsletter-email")).sendKeys("akshay@gmail.com");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
	}
}
