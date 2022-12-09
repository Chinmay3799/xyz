package com.selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> name = driver.getWindowHandles();

		Iterator<String> it = name.iterator();

		String parentWindow = it.next();

		String childWindow = it.next();

		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");

		String course = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']"))
				.get(1).getText();

		driver.switchTo().window(parentWindow);

	WebElement name1 = 	driver.findElement(By.cssSelector("[name='name']"));
		name1.sendKeys(course);
		
		File file=name1.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("logo.png"));
		
		name1.getRect().getDimension().getHeight();
		name1.getRect().getDimension().getWidth();
	
	}
}
