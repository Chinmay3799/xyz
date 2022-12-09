package Demo;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassFour {
	@Parameters({"URL"})
	@BeforeTest
	public void bef(String url) {
		System.out.println("class 4 bef class");
		System.out.println(url);
	}
	
	@Test(groups="smoke")
	public  void MobLoginHomeLoan() {
		System.out.println("MobLoginHomeLoan");
	}
	@Test(timeOut=4000)
	public void APILoginHomeLoan() {
		System.out.println(" LoginAPIHomeLoan");
	}
	@Test(groups="smoke")
	public void WebLoginHomeLoan() {
		System.out.println("WebLoginHomeLoan");
	}
}
