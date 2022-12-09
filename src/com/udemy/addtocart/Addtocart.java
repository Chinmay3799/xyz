package com.udemy.addtocart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	static void OpenWebPage(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
	}

	static void AddProduct(WebDriver driver, String[] items) {
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		List needitems = Arrays.asList(items);
		for (int i = 0; i < product.size(); i++) {
			String[] po = product.get(i).getText().split("-");
			String ab = po[0].trim();

			int j = 0;
			if (needitems.contains(ab)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if (j == items.length) {
					break;
				}
			}
		}

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		OpenWebPage(driver);
		String[] items = { "Cucumber", "Brocolli", "Tomato" };
		AddProduct(driver, items);
	}
}
