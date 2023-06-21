package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FEls1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/demo.html");
		List<WebElement> textBox = driver.findElements(By.xpath("(//tbody)[3]//input"));
		int count = textBox.size();
		System.out.println(count);
		for (int i = 0; i <count; i++) {
			textBox.get(i).sendKeys("hi");
			Thread.sleep(1000);
		}
		driver.close();
	}
}