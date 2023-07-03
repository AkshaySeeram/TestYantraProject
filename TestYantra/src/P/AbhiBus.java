package P;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("source")).sendKeys("Ban");
		List<WebElement> source = driver.findElements(By.xpath("//li[contains(text(),'Ban')]"));
		for (int i = 0; i <source.size(); i++) {
			if(i==0) {
				source.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("destination")).sendKeys("Chi");
		List<WebElement> destination = driver.findElements(By.xpath("//li[contains(text(),'Chi')]"));	
		for (int i = 0; i <destination.size(); i++) {
			if(i==0) {
				destination.get(i).click();
				break;
			}
		}
		driver.findElement(By.id("datepicker1")).click();
		while(true)
		{
			String text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			if(text.contains("July 2023"))
			{
				driver.findElement(By.xpath("(//tbody)[1]/tr/td/a[contains(text(),'15')]")).click();
				break;
			}

			else {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		driver.findElement(By.partialLinkText("Search")).click();
	}

}
