package Sel;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_Select_Class_A4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String text = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		//identify the select tag web element
		WebElement sortby = driver.findElement(By.id("products-orderby"));

		//creating object of select class 
		Select sel=new Select(sortby);
		List<WebElement> all = sel.getOptions();
		for (int i = 0; i <all.size(); i++) {
			String text1 = all.get(i).getText();
			if(text1.equals(text))
			{
				System.out.println("Item is matched and its index is "+i);
				break;
			}			
		}
		
		//or
		
		for (int i = 0; i <all.size(); i++) {
			if(all.get(i).getText().equalsIgnoreCase(text))
			{
				WebElement sortby1 = driver.findElement(By.id("products-orderby"));

				//creating object of select class 
				Select sel1=new Select(sortby1);
				sel1.selectByIndex(i);

				System.out.println("Item is matched and its index is "+i);
				break;
			}		
		}
		
		driver.close();
	}
}