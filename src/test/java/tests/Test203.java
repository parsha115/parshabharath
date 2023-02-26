package tests;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test203 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		DevTools dt=(((ChromiumDriver) driver).getDevTools());
		dt.close();
		
		Command cmd1=Network.enable(Optional.empty(),Optional.empty(),Optional.empty());
		Command cmd2=Network.setBlockedURLs(ImmutableList.of("*.css","*.png","*.gif"));
	//	dt.send(cmd1);
	//	dt.send(cmd2);
		//Launch site
		
		driver.get("https://www.redbus.in");
		Thread.sleep(5000);
		//driver.close();
	}

}
