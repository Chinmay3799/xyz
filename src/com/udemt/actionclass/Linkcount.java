package com.udemt.actionclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	WebElement o = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	System.out.println(o.findElements(By.tagName("a")).size());
	WebElement z= o.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(z.findElements(By.tagName("a")).size());
	
	for(int i=1;i< z.findElements(By.tagName("a")).size(); i++) {
		
	String s=	Keys.chord(Keys.CONTROL,Keys.ENTER);
	 z.findElements(By.tagName("a")).get(i).sendKeys(s);
	 
	}
	
	Set <String> x = driver.getWindowHandles();
	Iterator it= x.iterator();
	while(it.hasNext()) {
		driver.switchTo().window((String) it.next());
		System.out.println(driver.getTitle());
		
	}
	
	
}
}
