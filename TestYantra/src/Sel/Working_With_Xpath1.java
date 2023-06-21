package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("hi");		
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("bye");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("Testyantra");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("bangalore");
		Thread.sleep(3000);
		driver.close();
	}
}
