package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		while(true) {
			String month = driver.findElement(By.className("ui-datepicker-title")).getText();
			if(month.contains("February 2001")) {
				driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'22')]")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//span[contains(text(),'Prev')]")).click();
			}
		}
	}

}
