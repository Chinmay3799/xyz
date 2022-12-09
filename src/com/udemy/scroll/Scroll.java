package com.udemy.scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
		
		
		 List<WebElement> list = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			int sum=0;
		 for(int i = 0 ; i<list.size();i++) {
			 
			sum= sum+Integer.parseInt(list.get(i).getText());
		 }
		 
		 System.out.println(sum);
	}

}
