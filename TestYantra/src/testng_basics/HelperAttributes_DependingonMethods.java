package testng_basics;

import org.testng.annotations.Test;

public class HelperAttributes_DependingonMethods {

	@Test
	public void Books() {
		System.out.println("Executing Books");
	}
	
	@Test(dependsOnMethods = "Books")
	public void Computers() {
		System.out.println("Executing Computers");
	}
	
	@Test(dependsOnMethods = {"Books","Computers"})
	public void Electronics() {
		System.out.println("Executing Electronics");
	}
	
}  