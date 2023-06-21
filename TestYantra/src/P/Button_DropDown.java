package P;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.id("dropdownMenuButton")).click();
		driver.findElement(By.xpath("(//a[text()='Another action'])[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}
}