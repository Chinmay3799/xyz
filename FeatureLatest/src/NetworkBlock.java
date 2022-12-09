
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;

import com.google.common.collect.ImmutableList;


public class NetworkBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools dt = driver.getDevTools();
		dt.createSession();
	
		dt.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		dt.send(Network.setBlockedURLs(ImmutableList.of("*.jpg*","*.css*")));
		
		
		
	
	}

}
