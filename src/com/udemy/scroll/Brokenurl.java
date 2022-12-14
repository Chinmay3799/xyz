package com.udemy.scroll;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
public class Brokenurl {
	
	public static void main(String[] args) throws IOException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	/*	String s = driver.findElement(By.cssSelector("a[href='soapui']")).getAttribute("href");
		
      HttpURLConnection c= (HttpURLConnection)new URL(s).openConnection();
      c.setRequestMethod("HEAD");
      c.connect();
      int  r = c.getResponseCode();
      System.out.println(r);*/
      
      
      
      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

      SoftAssert a =new SoftAssert();

     

      for(WebElement link : links)

      {

       

          String url= link.getAttribute("href");

         

          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

          conn.setRequestMethod("HEAD");

          conn.connect();

          int respCode = conn.getResponseCode();

          System.out.println(respCode);

          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

         

     

      }

     

      a.assertAll();
	}
}
