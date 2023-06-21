package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Samsung {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.samsung.com/in/");
		driver.findElement(By.xpath("(//button)[16]")).click();
		driver.findElement(By.id("gnb-search-keyword")).sendKeys("Samsung galaxy s23 ultra"+Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
	}
}  