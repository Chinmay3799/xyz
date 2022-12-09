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

public class TitleValidation extends Base {


	LandingPage l;
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initial() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
	}
	@Test
	public void getTitle() throws IOException {
	
	 l = new LandingPage(driver);
		l.text().getText();
		Assert.assertEquals(l.text().getText(),"FEATURED COURSES");
		log.info("title is correct");
		
		
	}
	
	@Test
	public void validateHeader() {
		
		Assert.assertEquals(l.getHeader().getText(),"An Academy to learn Everything about Testing" );
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
