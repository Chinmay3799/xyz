package com.udemy.scroll;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenteight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getAttribute("value"));
        
        
     
	}

}
