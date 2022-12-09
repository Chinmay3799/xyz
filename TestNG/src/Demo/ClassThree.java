package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassThree {
	@BeforeSuite
	void suit(){
		System.out.println("hum first");
		
	}
	
	@BeforeClass
	void befcls() {
		System.out.println("bef class");
	}

	@Test
	public  void MobLoginCarLoan() {
		System.out.println("MobLoginCarLoan");
	}
	
	@Test(dependsOnMethods="WebLoginCarLoan")
	public void APILoginCarLoan() {
		System.out.println("APILoginCarLoan");
	}
	@BeforeMethod
	void befmet() {
		System.out.println("before method");
	}
	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCarLoan");
	}
	@AfterClass
	void affcls() {
		System.out.println("aft class");
	}
	@Test(enabled=false)
	public void MobSignInCarLoan() {
		System.out.println("MobSignInCarLoan");
	}
	@AfterMethod
	void aftmet() {
		System.out.println("aft method");
	}
	
}
