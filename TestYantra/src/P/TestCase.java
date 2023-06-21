package P;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {
 WebDriver driver;

 @BeforeClass
 void setup() {
  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
  driver = new ChromeDriver();

  driver.get("http://demo.nopcommerce.com");
  
  driver.manage().window().maximize();
 }

 @Test
 void verifyLinks() throws Exception {
  ScreenRecorderUtil.startRecord("CheckingLinks");
  driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click(); // Books
 Thread.sleep(3000);
  // Computers
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[1]/a")).click();
  System.out.println(driver.getTitle());
  Thread.sleep(3000);
  // Electronics
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
  System.out.println(driver.getTitle());
  
  // Apparel
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
  System.out.println(driver.getTitle());
  
  ScreenRecorderUtil.stopRecord();
 }
 
 @AfterClass
 void tearDown()
 {
  driver.close();
 }

}