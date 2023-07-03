package ppt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {

//	@Test
//	public void Demo() {
//		System.out.println("Hi");
//	}
	
	@Test
	public void demo() {
		System.out.println("Hi");
		Reporter.log("Hello");
		Reporter.log("Bye",false);
		Reporter.log("Byeee",true);
		//Assert.fail();
	}

//	@Test
//	public void createCustomer() {
//		Reporter.log("createCustomer",true);
//		Assert.fail();
//	}

}