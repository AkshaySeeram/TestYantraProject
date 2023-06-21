package P;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Yatra {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		driver.findElement(By.id("booking_engine_buses")).click();
		driver.findElement(By.id("BE_bus_from_station")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[3]")).click();
		driver.findElement(By.id("BE_bus_to_station")).click();
		driver.findElement(By.xpath("//div[@class='viewport']/div/div/li[8]")).click();
		driver.findElement(By.id("BE_bus_search_btn")).click();
		WebElement total = driver.findElement(By.className("fbold"));
		Thread.sleep(3000);
		File src = total.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Yatra.png");
		FileHandler.copy(src, dest);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./Screenshot/Yatra1.png");
		FileHandler.copy(src1, dest1);
		
		
	}
}
