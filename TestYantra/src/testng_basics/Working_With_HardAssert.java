package testng_basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Working_With_HardAssert {

	@Test
	public void HardAssertPractice() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		//Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
		Assert.assertEquals(driver.getTitle(),"Facebook");
		driver.findElement(By.partialLinkText("Log")).click();
		driver.close();
	}
}
