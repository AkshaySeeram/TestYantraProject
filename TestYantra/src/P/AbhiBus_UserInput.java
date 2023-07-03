package P;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus_UserInput {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the source place name : ");
		String src=sc.nextLine();
		System.out.println("Enter the destination place name : ");
		String dest=sc.nextLine();
		System.out.println("Enter the date only dd : ");
		int date=sc.nextInt();
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("source")).sendKeys(src);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'"+src+"')]")).click();
		//source.get(0).click();
		
		
//		for (int i = 0; i <source.size(); i++) {
//			if(i==0) {
//				source.get(i).click();
//				break;
//			}
//		}
		driver.findElement(By.id("destination")).sendKeys(dest);
		List<WebElement> destination = driver.findElements(By.xpath("//li[contains(text(),'"+dest+"')]"));
		destination.get(0).click();
		
		
//		for (int i = 0; i <destination.size(); i++) {
//			if(i==0) {
//				destination.get(i).click();
//				break;
//			}
//		}
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker1")).click();
		while(true)
		{
			String text = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			Thread.sleep(2000);
			if(text.contains("July 2023"))
			{
				driver.findElement(By.xpath("(//tbody)[1]/tr/td/a[contains(text(),'"+date+"')]")).click();
				break;
			}
			
			else {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Search")).click();
	}
}
