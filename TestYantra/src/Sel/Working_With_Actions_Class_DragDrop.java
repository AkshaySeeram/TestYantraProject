package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions_Class_DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action=new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Rome'])[2]")),driver.findElement(By.xpath("//div[text()='Italy']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Madrid'])[2]")),driver.findElement(By.xpath("//div[text()='Spain']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Oslo'])[2]")),driver.findElement(By.xpath("//div[text()='Norway']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Copenhagen'])[2]")),driver.findElement(By.xpath("//div[text()='Denmark']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Seoul'])[2]")),driver.findElement(By.xpath("//div[text()='South Korea']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]")),driver.findElement(By.xpath("//div[text()='Sweden']"))).perform();
		action.dragAndDrop(driver.findElement(By.xpath("(//div[text()='Washington'])[2]")),driver.findElement(By.xpath("//div[text()='United States']"))).perform();
		Thread.sleep(3000);
		driver.quit();  
	}
}