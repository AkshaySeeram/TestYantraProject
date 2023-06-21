package testng_basics;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "SmokeTest")
	public void Login() {
		System.out.println("Executing Login");
	}
	
	@Test
	public void SearchTest() {
		System.out.println("Executing Search");
	}
	
	@Test(groups = "SmokeTest")
	public void Register() {
		System.out.println("Executing Register");
	}
	
}
