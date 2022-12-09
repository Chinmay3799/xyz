package com.udemy.checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractice {
	
	static void OpenWebPage(WebDriver driver) 
	{
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	}
	 static void FillInfo(WebDriver driver) throws InterruptedException {
		 driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys("Chinmay Bodhe");
		 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("xyz@gmail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("Xyz@12345");
		 driver.findElement(By.id("exampleCheck1")).click();
		 WebElement op =driver.findElement(By.id("exampleFormControlSelect1"));
		 Select ops  =new Select(op);
		 ops.selectByIndex(0);
		 driver.findElement(By.id("inlineRadio2"));
		 driver.findElement(By.xpath("//input[@name='bday']"));
		 driver.findElement(By.cssSelector("input[type='submit']")).click();
		 System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		 
	 }
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	OpenWebPage(driver);
	 FillInfo(driver);
}
}
