package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
 public	By signin = By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");
	 By text= By.xpath("//h2[contains(text(),'Featured Courses')]");
	 By navbar = By.xpath("//a[contains(text(),'Contact')]");
	 By header =  By.xpath("//h3[contains(text(),'An Academy to learn Everything about Testing')]");
	public LandingPage(WebDriver driver) {
	this.driver = driver;
	}

	public WebElement signin() {
		
		/* driver.findElement(signin).click();
			LoginPage lo = new LoginPage(driver);
			return lo; */
		return driver.findElement(signin);
		
	}
	
	public WebElement text() {
		return driver.findElement(text);
	}
	
	public WebElement navibar() {
		return driver.findElement(navbar);
	}
	
	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
