package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_getText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String register_Text = driver.findElement(By.linkText("Register")).getText();
		System.out.println(register_Text);
		
		String shopping_Text = driver.findElement(By.partialLinkText("oppi")).getText();
		System.out.println(shopping_Text);
		
		String search_Text = driver.findElement(By.id("small-searchterms")).getText();
		System.out.println(search_Text);
		
		driver.close();
	}
}
