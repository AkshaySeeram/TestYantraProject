package Testng_testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Radio_Vote extends Base_Test{

	@Test
	public void Radio() throws InterruptedException {
		driver.findElement(By.id("pollanswers-1")).click();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='poll-vote-error']")).getText());
	}
}
