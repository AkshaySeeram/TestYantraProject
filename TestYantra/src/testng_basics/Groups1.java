package testng_basics;

import org.testng.annotations.Test;

public class Groups1 {

	@Test(groups = "SmokeTest")
	public void Vote() {
		System.out.println("Executing Vote");
	}
	
	@Test
	public void Subscribe() {
		System.out.println("Executing Subscribe");
	}
		
}