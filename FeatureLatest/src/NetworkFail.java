import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v101.fetch.Fetch;
import org.openqa.selenium.devtools.v101.fetch.model.RequestPattern;
import org.openqa.selenium.devtools.v101.network.model.ErrorReason;

public class NetworkFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools dt = driver.getDevTools();
		dt.createSession();
		
	Optional<List<RequestPattern>> pattern = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"),Optional.empty(),Optional.empty())));
	
		dt.send(Fetch.enable(pattern ,Optional.empty()));
		
		dt.addListener(Fetch.requestPaused(), request ->
		{
			dt.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[contains(text(),'Virtual Library')]")).click();
		
	}

}
