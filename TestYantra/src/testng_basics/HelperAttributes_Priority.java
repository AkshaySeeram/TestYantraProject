package testng_basics;

import org.testng.annotations.Test;

public class HelperAttributes_Priority {

	@Test(priority = 2)
	public void Login() {
		System.out.println("Executing Login");
	}
	
	@Test(priority = 3)
	public void SearchTest() {
		System.out.println("Executing Search");
	}
	
	@Test(priority = 1)
	public void Register() {
		System.out.println("Executing Register");
	}
	
}
