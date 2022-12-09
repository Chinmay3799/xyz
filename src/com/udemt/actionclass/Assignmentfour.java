package com.udemt.actionclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentfour {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("a[href='/windows']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
	Set <String> window=driver.getWindowHandles();
	Iterator <String> it =window.iterator();
	String pw=it.next();
	String cw = it.next();
	driver.switchTo().window(cw);

	
	 System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	
	 driver.switchTo().window(pw);
	 System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
	 
}
}
