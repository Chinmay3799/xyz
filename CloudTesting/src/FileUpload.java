import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sodapdf.com/txt-to-pdf/");
		driver.findElement(By.xpath("//body/div[@id='wrapper']/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/label[1]")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\Grid\\up.exe");
	}
}
