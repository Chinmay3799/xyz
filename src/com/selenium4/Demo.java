package com.selenium4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name= driver.findElement(By.cssSelector("[name='name']"));
		
		System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText());
		
		WebElement dob =driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
	//System.out.println(	driver.findElement(with(By.tagName("input")).below(dob)).getText());
	driver.findElement(with(By.tagName("input")).below(dob)).click();
	
	WebElement cb = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	driver.findElement(with(By.tagName("input")).toLeftOf(cb)).click();
	
	WebElement cb1= driver.findElement(By.id("inlineRadio1"));
	cb1.click();
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(cb1)).getText());
	
	
		
	}

}
