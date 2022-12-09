package com.udemt.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentsix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	 
	String name = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	 
	
	Select drop= new Select(driver.findElement(By.id("dropdown-class-example")));
	

	
	drop.selectByVisibleText(name);
	
	driver.findElement(By.id("name")).sendKeys(name);
	driver.findElement(By.id("alertbtn")).click();
	String alerttext=driver.switchTo().alert().getText();
	if(alerttext.contains(name)) {
		System.out.println("alert success.");
	}
		else {
			System.out.println("alert not success.");
		}
	
	Thread.sleep(2000);
	driver.switchTo().alert().accept();

	
	}

}
