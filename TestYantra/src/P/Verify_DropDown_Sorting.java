package P;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_DropDown_Sorting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com");
		WebElement element = driver.findElement(By.id("animals"));
		Select s=new Select(element);
		List<String> orginalList=new ArrayList<String>();
		List<String> tempList=new ArrayList<String>();
		List<WebElement> options = s.getOptions();
		for (WebElement e : options) {
			orginalList.add(e.getText());
			tempList.add(e.getText());
		}
		System.out.println("Before sorting orginallist " +orginalList);
		System.out.println("Before sorting templist " +tempList);
		Collections.sort(tempList);
		System.out.println("After sorting orginallist " +orginalList);
		System.out.println("After sorting templist " +tempList);
		if(orginalList==tempList) {
			System.out.println("Dropdown Sorted");
		}
		else {
			System.out.println("Dropdown Not Sorted");
		}
		driver.close();
	}
}