package Demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassTwo {

	@Test
	void xMethod() {
		System.out.println("x");
	}
	@BeforeTest
	void zMethod() {
		System.out.println("I will execute first");
	}
	
}
