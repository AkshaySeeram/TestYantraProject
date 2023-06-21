package Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class_A1 {

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
		sel.selectByVisibleText("Price: Low to High");
		Thread.sleep(2000);

		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select dis=new Select(display);
		dis.selectByIndex(2);
		Thread.sleep(2000);


		WebElement view= driver.findElement(By.id("products-viewmode"));
		Select vie=new Select(view);
		vie.selectByVisibleText("List");
		Thread.sleep(2000);


		driver.close();
	}

}
