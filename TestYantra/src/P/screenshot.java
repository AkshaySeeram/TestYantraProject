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

public class screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");

		//how to take screenshot
		TakesScreenshot	ts=(TakesScreenshot) driver;

		WebElement img = driver.findElement(By.xpath("(//img)[1]"));
		//take Screenshot and save
		File src = img.getScreenshotAs(OutputType.FILE);

		//To save in our project
		File dest=new File("./Screenshot/firstscreenshot.png");

		FileHandler.copy(src, dest);

	}

}
