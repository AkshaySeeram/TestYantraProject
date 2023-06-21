package ppt;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Demo { public static void main(String[] args) throws InterruptedException { 
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
	ChromeDriver c= new ChromeDriver(); 
	c.get("https://www.google.com");  
	String title = c.getTitle(); 
	System.out.println(title);
	Thread.sleep(4000);
	c.close();  
}
}