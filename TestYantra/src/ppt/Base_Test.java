package ppt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Base_Test {

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void Browser_Setup(String browser) {
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
		if(browser.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			//WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
	}

	@AfterClass
	public void Browser_TearDown() {
		driver.quit();
	}

}