package com.udemy.addtocart;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentthree {

	static void OpenWebPage(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
	}

	static void Login(WebDriver driver) {
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
        driver.findElement(By.id("okayBtn")).click();
        
		WebElement drop = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select ob =new Select(drop);
		ob.selectByIndex(2);
		//driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
	
		Wait <WebDriver> obj=  new FluentWait <WebDriver> (driver).withTimeout(Duration.ofSeconds(8))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	
		
		
		
		
		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
	List<WebElement>  product = driver.findElements(By.cssSelector("button[class='btn btn-info']"));
	
	for(int i=0; i<product.size();i++) {
		
		
		 product.get(i).click();
		}
	driver.findElement(By.partialLinkText("Checkout")).click();
	}
		
		
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		OpenWebPage(driver);
		Login(driver);
	}
}
