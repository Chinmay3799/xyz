package Udemy.Project;

import java.io.IOException;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.ForgotPassword;
import pageobject.LandingPage;
import pageobject.LoginPage;
import resources.Base;

public class HomePage extends Base {

	public WebDriver driver;
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void initial() throws IOException {
		driver = initializeDriver();

	}

	@Test(dataProvider = "getData")
	public void log(String username, String password, String text) throws IOException {
		driver.get(prop.getProperty("url"));

		LandingPage l = new LandingPage(driver);

		 l.signin().click();
		//LoginPage lp = l.signin();
		 LoginPage lp = new LoginPage(driver);
		lp.email().sendKeys(username);
		lp.password().sendKeys(password);
		System.out.println(text);
		lp.submit().click();
		ForgotPassword fp =lp.forgotPass();
		fp.getmail().sendKeys("asdsd");
		fp.getsendMeinstruction().click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][3];

		data[0][0] = "abc@gmail.com";
		data[0][1] = "asdsd";
		data[0][2] = "restrictnot";

		/*
		 * data[1][0]="abcsgdg@gmail.com"; data[1][1]="asdsdgssd";
		 * data[1][2]="restrict";
		 */
		return data;

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
