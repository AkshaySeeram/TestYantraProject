package testng_basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperAttributes_ThreadPool_InvocationCount {

	@Test(threadPoolSize = 5,invocationCount = 10)
	public void DWS() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}
	
}