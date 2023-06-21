package ppt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box:')]")).click();
//		Thread.sleep(2000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.close();
//		
//		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
//		Thread.sleep(2000);
//		//driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
		
//		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().sendKeys("Qspider");
//		Thread.sleep(3000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);		
//		driver.close();
		driver.switchTo().alert().accept();
		
	}
}
