package P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.close();		
	}
}