package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_getAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		driver.findElement(By.id("small-searchterms")).sendKeys("BYE");
		System.out.println(driver.findElement(By.id("small-searchterms")).getAttribute("value"));
		
		driver.close();
	}
}
 