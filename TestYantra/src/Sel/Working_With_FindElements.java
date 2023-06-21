package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> script = driver.findElements(By.xpath("//a[contains(text(),'Books')]"));
		for (int i = 0; i<=script.size()-1; i++) {
			String text = script.get(i).getText();
			System.out.println(text);			
		}
		driver.quit();
	}
}