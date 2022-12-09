import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo2 {
	
	
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\Selenium\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();
	
	
}
}
