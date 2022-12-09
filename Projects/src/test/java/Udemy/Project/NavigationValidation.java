package Udemy.Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LandingPage;
import resources.Base;


public class NavigationValidation extends Base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initial() throws IOException {
		

		
	 log =LogManager.getLogger(Base.class.getName());
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("navigated to url");
	
		
	}
	@Test
	public void getNav() throws IOException {
	
		LandingPage lp = new LandingPage(driver);
		
		
		Assert.assertTrue(lp.navibar().isDisplayed());
		log.info("object is visible");
		
		
		
		
}
	@AfterTest
	public void close() {
		driver.close();
	}
}
