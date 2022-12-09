package resources;

import java.io.File;
import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public Properties prop;
	public  WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		
		 prop = new Properties();
		 
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//String browserName =System.getProperty("browser");
		String browserName=  prop.getProperty("browser");
		
		System.out.println(browserName);
		if(browserName.contains("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			if(browserName.contains("headless")) {
				  co.addArguments("--headless");
			}
		  
			driver = new ChromeDriver(co);
			
		}
		else if(browserName.equals("firefox")) 
		{
			
		}
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshotPath(String testcasename,WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationfile= System.getProperty("user.dir")+"\\reports"+testcasename+".png";
		FileUtils.copyFile(source, new File(destinationfile));
		return destinationfile;
	}
}
