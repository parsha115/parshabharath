package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.network.Network;
import org.openqa.selenium.devtools.v95.network.model.ConnectionType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test202 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		DevTools dt=(((ChromiumDriver) driver).getDevTools());
		dt.close();
	
		long et=System.currentTimeMillis();
		driver.get("http://www.redbus.in");
		long st=System.currentTimeMillis();
		
		System.out.println("Load time is "+(et-st)+" msec");
		driver.close();
	}

}
