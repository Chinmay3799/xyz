package com.udemt.actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		driver.findElement(By.xpath("//td[@class='next']/button ")).click();

		while (!driver.findElement(By.xpath("//td[@class='monthTitle']")).getText().contains("Nov")) {

			driver.findElement(By.xpath("//td[@class='next']/button ")).click();

		}
		List<WebElement> date = driver.findElements(By.xpath("//td[@class='wd day']"));
		for (int i = 1; i < date.size(); i++) {
			String s = date.get(i).getText();
			if (s.equalsIgnoreCase("14")) {
				date.get(i).click();
			}
		}
		
		
		
	
		

	}

}
