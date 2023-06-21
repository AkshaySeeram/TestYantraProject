package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Electronics")).click();		
		driver.findElement(By.partialLinkText("Cell phones")).click();		
		WebElement sortby = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sortby);
		s.selectByVisibleText("Price: Low to High");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();	
		Thread.sleep(5000);
		WebElement manu = driver.findElement(By.xpath("(//select)[1]"));
		Select s2=new Select(manu);
		s2.selectByValue("113");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();		
		driver.findElement(By.id("termsofservice")).click();		
		driver.findElement(By.id("checkout")).click();		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();		
		Thread.sleep(3000);
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
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='paymentmethod'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("CardholderName")).sendKeys("Tyss");
		driver.findElement(By.id("CardNumber")).sendKeys("1234567890123456");
		WebElement month = driver.findElement(By.id("ExpireMonth"));
		Select s3=new Select(month);
		s3.selectByVisibleText("02");
		Thread.sleep(3000);
		WebElement year= driver.findElement(By.id("ExpireYear"));
		Select s4=new Select(year);
		s4.selectByVisibleText("2025");
		Thread.sleep(3000);
		driver.findElement(By.id("CardCode")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//div[@class='title']")).getText());		
		System.out.println(driver.findElement(By.xpath("//ul[@class='details']")).getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
