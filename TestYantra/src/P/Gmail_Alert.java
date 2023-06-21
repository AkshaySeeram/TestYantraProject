package P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("akshayseeram@gmail.com");
	}
}
