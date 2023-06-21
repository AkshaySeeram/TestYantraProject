package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tc1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();		
		driver.findElement(By.partialLinkText("Cell phones")).click();		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();	
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Shopping cart']"))));
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();		
		driver.findElement(By.id("termsofservice")).click();		
		driver.findElement(By.id("checkout")).click();		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Checkout as Guest']"))));
		driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("BillingNewAddress_FirstName"))));
		driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("Hi");		
		driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Bye");		
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("hibye@gmail.com");	
		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Bangalore");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Btm");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("560076");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("560076");
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[1]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[2]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[3]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[4]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@value='Continue'])[5]"))));
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();	
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='Confirm']"))));
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='title']")).getText());		
		System.out.println(driver.findElement(By.xpath("//ul[@class='details']")).getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		driver.close();
	}	
}