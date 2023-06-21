package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_CssValue {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		String jewelry_color = driver.findElement(By.partialLinkText("Jewelry")).getCssValue("color");
		System.out.println(jewelry_color);

		String giftcard_minheight = driver.findElement(By.partialLinkText("Gift Card")).getCssValue("min-height");
		System.out.println(giftcard_minheight);

		driver.close();
	}
}