package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ForgotPassword {

	WebDriver driver;
	
	By user= By.id("user_email");
	By sendMeinstruction = By.cssSelector("[type='submit']");
	
	public ForgotPassword(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getmail() {
		return driver.findElement(user);
	}
	public WebElement getsendMeinstruction() {
		return driver.findElement(sendMeinstruction);
	}
}
