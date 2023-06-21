package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).perform();
		Thread.sleep(1000);
		driver.close();
	}
}