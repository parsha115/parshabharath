package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test186 {

	public static void main(String[] args) throws Exception
	{
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(2000));
	   driver.manage().window().maximize();
	   driver.get("http://www.facebook.com");
	   Thread.sleep(5000);
	   driver.navigate().to("http://www.yahoo.com");
	   Thread.sleep(5000);
	   driver.executeScript("window.location='https://www.magnitia.com';");
	}

}
