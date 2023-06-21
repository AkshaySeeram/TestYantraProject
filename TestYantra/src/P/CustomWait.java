package P;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
	static {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		int i = 0;
		while(i<1000)
		{
			try
			{
				driver.findElement(By.id("logoutLink")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				i++ ;
			}
		}
		System.out.println(i);
		driver.close();
	}
}