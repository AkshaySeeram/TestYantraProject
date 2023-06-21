package Sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class_getopt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/demo.html");
		
		//identify the select tag web element
		WebElement cars = driver.findElement(By.id("standard_cars"));
		
		//creating object of select class 
		Select sel=new Select(cars);
		Thread.sleep(2000);
		System.out.println(sel.isMultiple());
		List<WebElement> opt = sel.getOptions();
		
		//for loop
		for (int i = 0; i <opt.size(); i++) {
			System.out.println(opt.get(i).getText());
		}
		
		//for each
		for (WebElement name:opt) {
			System.out.println(name.getText());
		}
		driver.close();
	
	}

}
