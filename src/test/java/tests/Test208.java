package tests;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test208 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	    wait.withTimeout(Duration.ofSeconds(20));
	    wait.pollingEvery(Duration.ofMillis(2000));
	    driver.manage().window().maximize();
	    DevTools dt=(((ChromeDriver) driver).getDevTools());
		dt.close();
		
		HashMap<String,Object> params=new HashMap<String,Object>();
        params.put("latitude",27.1751);
        params.put("longitude",78.0421); 
        params.put("accuracy", 1);
        ((ChromiumDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride",params);
        
	    driver.get("http://www.google.com");

	}

}
