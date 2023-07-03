package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Robot_Class_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\AKSHAY SEERAM\\OneDrive\\Desktop\\SELENIUM NOTES (1).pdf");
		
		Thread.sleep(5000);
		driver.close();
	}	
}