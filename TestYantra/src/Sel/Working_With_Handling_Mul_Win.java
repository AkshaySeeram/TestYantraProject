package Sel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Handling_Mul_Win {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/AKSHAY%20SEERAM/OneDrive/Desktop/Selenium%20Training/MultipleWindow.html");
		
		//Identifying parent window
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		
		//clicking on the button
		driver.findElement(By.cssSelector("input[type='button']")).click();
		Thread.sleep(3000);
		
		//identifying child windows including parent window
		Set<String> child_windows = driver.getWindowHandles();
		System.out.println(child_windows);
		
		//switch to child window and closing one by one 
		for (String win: child_windows) {
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(3000);
		}
	}
}