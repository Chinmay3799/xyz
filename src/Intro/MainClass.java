package Intro;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	public String Password(WebDriver driver) {
		driver.findElement(By.xpath("//div/button[2]")).click();
		String pass= driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
	String []	pass1 = pass.split("'");
	String[] pass2= pass1[1].split("'");
	
String p =	pass2[0];
 //System.out.println(password);
return p;
	
		
	}
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\user\\\\Desktop\\\\Selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Chinmay");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("xyz");
	driver.findElement(By.xpath("//form/button")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("John");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	
	MainClass obj = new MainClass();
	
	String password=obj.Password(driver);
	//driver.findElement(By.xpath("//div/button[2]")).click();
	//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.xpath("//form/button")).click();
	//System.out.println(driver.findElement(By.tagName("p")));
	driver.findElement(By.cssSelector("button[class='logout-btn']"));

	
}
}
