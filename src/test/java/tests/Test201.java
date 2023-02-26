package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test201 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver1=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver1);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver1.manage().window().maximize();
		driver1.get("http://www.gmail.com");
		DevTools dt=((ChromiumDriver) driver1).getDevTools();
		dt.close();
		try
		{
			Command c=new Command("Browser.crash",ImmutableMap.of());
		    dt.send(c);
		}
		catch(Exception ex)
		{
			System.out.println("Countiune further testing");
		}
		Thread.sleep(5000);
		try
		{ 
			ChromeDriver driver2=new ChromeDriver();
			driver2.get("http://www.gmail.com");
			System.out.println("Recovery test passed");
			driver2.close();
		}
		catch(Exception ex)
		{
			System.out.println("Recovery test failed");
		}
	}

}
