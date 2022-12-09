import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import org.openqa.selenium.devtools.v101.network.model.ConnectionType;

public class NetworkSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
		dt.send(Network.enable(Optional.empty(),Optional.empty(),Optional.empty()));
	//	dt.send(Network.emulateNetworkConditions(false, 4000, 30000, 30000 , Optional.of(ConnectionType.WIFI)));
		
		dt.addListener(Network.loadingFailed(), loadingFailed ->{
			
			loadingFailed.getErrorText();
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[contains(text(),'Virtual Library')]")).click();
	}

}
