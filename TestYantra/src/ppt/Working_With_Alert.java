package ppt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		//driver.findElement(By.xpath("(//button[contains(text(),'click the button')])[1]")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate')]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Qspider");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
}
