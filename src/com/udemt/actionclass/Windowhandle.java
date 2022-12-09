package com.udemt.actionclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		Set <String>w=driver.getWindowHandles();
	     Iterator <String> it = w.iterator();
	     String pi=it.next();
	     String ci=it.next();
		driver.switchTo().window(ci);
		
		
	}

}
