package Testng_testcases;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import FrameWork_utility.Base_Test;

public class DWS_Books extends Base_Test {

	@Test
	public void Books() throws InterruptedException {
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		driver.findElement(By.partialLinkText("Shopp")).click();
		Thread.sleep(3000);
	}
}
