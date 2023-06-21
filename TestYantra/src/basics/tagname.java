package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.tagName("input")).click();
		//driver.findElement(By.id("small-searchterms")).click();
		//driver.findElement(By.name("q")).click();
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).click();
	}

}
