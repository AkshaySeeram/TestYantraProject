package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_WebdriverWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Register"))));
		driver.findElement(By.id("small-searchterms")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//strong[@class='result']"))));
		String result = driver.findElement(By.xpath("//strong[@class='result']")).getText();
		System.out.println(result);
		driver.close();
	}
}