package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class_A2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		//identify the select tag web element
		WebElement sortby = driver.findElement(By.id("products-orderby"));

		//creating object of select class 
		Select sel=new Select(sortby);

		List<WebElement> all = sel.getOptions();
		for (WebElement name: all) {
			System.out.println(name.getText());
		}
		driver.close();
	}
}