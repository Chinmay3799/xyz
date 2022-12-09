package com.udemy.scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
    
      WebElement table=driver.findElement(By.id("product"));

      System.out.println(table.findElements(By.tagName("tr")).size());

      System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

      List<WebElement> secondrow= driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
       for(int i=0;i<secondrow.size();i++) {
    	   
    	   System.out.println(secondrow.get(i).getText());
       }

    
	}

}
