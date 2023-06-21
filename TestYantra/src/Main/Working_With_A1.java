package Main;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_A1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Random r=new Random();
		int num=r.nextInt(1000);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		boolean radio_button = driver.findElement(By.id("gender-male")).isSelected();
		if (radio_button==true) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		driver.findElement(By.id("FirstName")).sendKeys("S");
		Thread.sleep(1000);
		driver.findElement(By.id("LastName")).sendKeys("Akshay");
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("akshay"+num+"@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("akshay");
		Thread.sleep(1000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("akshay");
		Thread.sleep(1000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.className("result")).getText());
		Thread.sleep(3000);
		driver.close();
	}
}