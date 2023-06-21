package P;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='video-title-link'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[12]")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}