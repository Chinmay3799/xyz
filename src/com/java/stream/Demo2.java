package com.java.stream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		driver.findElement(By.xpath("//thead/tr/th[1]")).click();
		
		List <WebElement> itoms1= driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		//List <String> it= itoms.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//List <String> sorteditoms = it.stream().sorted().collect(Collectors.toList());
		
		//Assert.assertTrue(it.contains(sorteditoms));
		List <String> price;
		do
		{
			List <WebElement> itoms= driver.findElements(By.xpath("//tbody/tr/td[1]"));
	 price = itoms.stream().filter(s->s.getText().contains("Rice")).map(s->getVegPrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if (price.size()<1) {
			
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			
		}
		
	}
		while(price.size()<1);
	}

	private static String getVegPrice(WebElement s) {
		// TODO Auto-generated method stub
	String p= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return p;
	
	}
}
