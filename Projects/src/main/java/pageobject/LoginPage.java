package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By submit = By.cssSelector("[value='Log In']");
	By forgotpass = By.xpath("//a[contains(text(),'Forgot Password?')]");
	public LoginPage(WebDriver driver) {
	
		this.driver=driver;
	}

	public WebElement email() {
		return driver.findElement(email);
	}
	

	public WebElement password() {
		return driver.findElement(password);
	}
	

	public WebElement submit() {
		return driver.findElement(submit);
	}
	public ForgotPassword forgotPass() {
		 driver.findElement(forgotpass).click();
	return new ForgotPassword(driver);
		
		 
	}
}
