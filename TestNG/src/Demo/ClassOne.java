package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

	@AfterTest
	public void Last() {
		System.out.println("I will execute last");
	}
	@Test(groups="smoke")
	public void Demo() {
		System.out.println("Demo");
	}
	
	@Parameters({"URL"})
	@Test
	public void SecondTest(String url) {
		System.out.println("SecondTest");
		System.out.println(url);
	}
	
	@AfterSuite
	void ab() {
		System.out.println("hum last");
	}
	
}