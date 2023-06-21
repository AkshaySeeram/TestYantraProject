package P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Working_With_Edge_Browser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}

}
