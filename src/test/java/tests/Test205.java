package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.security.Security;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test205 {

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
		
	    Command cmd1=Security.enable();
	    Command cmd2=Security.setIgnoreCertificateErrors(true);
	    dt.send(cmd1);
	    dt.send(cmd2);
        //launch insecure web site
        driver.get("https://expired.badssl.com/");

	}

}
