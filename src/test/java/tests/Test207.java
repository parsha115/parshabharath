package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test207 {

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
		Command cmd1=new Command("Emulation.setUserAgentOverride",ImmutableMap.of("userAgent",
                                "Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 "
                                  +"(KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1"));
		
		Command cmd2=new Command("Emulation.setDeviceMetricsOverride",ImmutableMap.of(
				                 "width",375,"height",812,"deviceScaleFactor",3,"mobile",true,"scale",1));
		
	//	dt.send(cmd1);
	//	dt.send(cmd2);
		
		driver.get("https://www.magnitia.com");
		
	}

}
