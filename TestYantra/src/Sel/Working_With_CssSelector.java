package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_CssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();		
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();		
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Computer");		
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		driver.close();
	}
}  