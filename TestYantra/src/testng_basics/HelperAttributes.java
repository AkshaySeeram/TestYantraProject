package testng_basics;

import org.testng.annotations.Test;

public class HelperAttributes {
	
	@Test
	public void computers() {
		System.out.println("Executing computers");
	}
	
	@Test
	public void Computers() {
		System.out.println("Executing Computers");
	}

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
	
	@Test(dependsOnMethods = "SearchTest")
	public void Books() {
		System.out.println("Executing Books");
	}
	
	@Test(dependsOnMethods = {"SearchTest","Books"})
	public void Electronics() {
		System.out.println("Executing Electronics");
	}
	
}