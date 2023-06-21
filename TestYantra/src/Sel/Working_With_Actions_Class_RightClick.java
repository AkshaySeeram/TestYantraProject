package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions action=new Actions(driver);
		action.contextClick(right).perform();
		Thread.sleep(4000);
		action.contextClick(driver.findElement(By.xpath("//span[contains(text(),'Delete')]"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
	}
}