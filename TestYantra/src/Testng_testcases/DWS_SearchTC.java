package Testng_testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_SearchTC extends Base_Test{

	@Test
	public void search() {
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
