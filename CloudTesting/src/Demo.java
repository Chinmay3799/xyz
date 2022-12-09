import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static final String USERNAME = "rahul2";

	  public static final String ACCESS_KEY = "xxxxx";

	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability("platform", "Windows 7");

		cap.setCapability("version", "51.0");
		WebDriver driver = new RemoteWebDriver(new URL(URL),cap);
		driver.get("google.com");
	}

}
