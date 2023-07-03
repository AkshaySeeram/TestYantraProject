package ppt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends Base_Test{

	@Test
	public void demo() throws InterruptedException {
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Akshay");
		driver.findElement(By.id("LastName")).sendKeys("S");
		driver.findElement(By.id("Email")).sendKeys("akshay@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Akshay@143");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Akshay@143");
		driver.findElement(By.id("register-button")).click();
//		try{
//		driver.findElement(By.partialLinkText("Log out")).click();
//		}
//		catch (NoSuchElementException e) {
//			Assert.fail();
//		}
		
		Thread.sleep(3000);
	}
}
