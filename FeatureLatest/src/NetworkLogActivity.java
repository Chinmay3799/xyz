import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.network.Network;
import org.openqa.selenium.devtools.v101.network.model.Response;
import org.openqa.selenium.devtools.v101.network.model.Request;

public class NetworkLogActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools dt = driver.getDevTools();
		dt.createSession();

		dt.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		dt.addListener(Network.requestWillBeSent(), request -> {

			Request req = request.getRequest();
			//System.out.println(req.getUrl());

		});
		dt.addListener(Network.responseReceived(), response -> {

			Response rs = response.getResponse();
			if(rs.getStatus().toString().startsWith("4")) {
				System.out.println(rs.getUrl());
				System.out.println(rs.getStatus());
			}
			

		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[contains(text(),'Virtual Library')]")).click();
	}

}
