import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v103.fetch.Fetch;

public class NetworkMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools dt = driver.getDevTools();
		dt.createSession();
		dt.send(Fetch.enable(Optional.empty(), Optional.empty()));
		dt.addListener(org.openqa.selenium.devtools.v85.fetch.Fetch.requestPaused(), request ->
		{
			if(request.getRequest().getUrl().contains("=shetty")) {
				
			
				String newUrl = request.getRequest().getUrl().replace("=shetty", "=badguy");
				System.out.println(newUrl);
				dt.send(org.openqa.selenium.devtools.v85.fetch.Fetch.continueRequest(request.getRequestId(), 
						Optional.of(newUrl),Optional.of(request.getRequest().getMethod()),Optional.empty(), Optional.empty()));
			}
			else {
				dt.send(org.openqa.selenium.devtools.v85.fetch.Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),Optional.of(request.getRequest().getMethod()),Optional.empty(), Optional.empty()));
			}
		}
				);
		
	}
}

