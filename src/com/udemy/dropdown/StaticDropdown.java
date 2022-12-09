package com.udemy.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	static void OpenWebPage(WebDriver driver) {
		driver.get("https://book.spicejet.com/search.aspx");
		driver.manage().window().maximize();
	}

	static void currancy(WebDriver driver) {
		WebElement select = driver
				.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
		Select sel = new Select(select);
		sel.selectByValue("USD");
		sel.selectByIndex(3);
	}

	static void passanger(WebDriver driver) {
		WebElement passenger = driver.findElement(By.id("divpaxinfo"));
		passenger.click();
		WebElement adult = driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
		Select sel = new Select(adult);
		sel.selectByIndex(3);
		WebElement child = driver.findElement(
				By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
		Select ch = new Select(child);
		ch.selectByIndex(2);

	}

	static void fromcity(WebDriver driver) {
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT"))
				.click();
		// WebElement from =
		// driver.findElement(By.xpath("//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR']"));
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
	}

	static void destination(WebDriver driver) {
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT"));
		driver.findElement(By.xpath(
				"//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
	}

	static void autosugg(WebDriver driver) throws Exception {
		// driver.findElement(By.xpath("//span[contains(text(),'Hotels')]")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@class='required ui-autocomplete-input
		// WM']")).sendKeys("sat");
		// https://alphagov.github.io/accessible-autocomplete/examples/
		driver.findElement(By.xpath("//input[@id='autocomplete-default']")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='autocomplete__option']"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

	}

	static void date(WebDriver driver) {
		driver.findElement(
				By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")).click();
		if (driver.findElement(By.id("marketDate_2")).getAttribute("style").contains("1")) {
			System.out.println("is enabled");
		} else {
			System.out.println("not enabled");
		}

	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Documents\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		OpenWebPage(driver);
		// passanger(driver);
		// currancy(driver);
		// passanger(driver);
		// fromcity(driver);
		// destination(driver);
		// autosugg(driver);
		date(driver);
	}

}
