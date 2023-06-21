package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Handling_Alert_GetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions action=new Actions(driver);
		action.contextClick(rightClick).build().perform();
		List<WebElement> elements = driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]"));
		for (int i = 0; i <elements.size(); i++) {
			elements.get(i).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
			action.contextClick(rightClick).build().perform();
		}
		driver.close();
	}
}