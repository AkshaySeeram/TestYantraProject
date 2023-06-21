package testng_basics;

import org.testng.annotations.Test;

public class Include_Exclude {

	@Test
	public void Login() {
		System.out.println("Executing Login");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Executing Search");
	}
	
	@Test
	public void Register() {
		System.out.println("Executing Register");
	}
	
}