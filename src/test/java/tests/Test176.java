package tests;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test176 {

	public static void main(String[] args) throws Exception
	{
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(1000));
	   driver.manage().window().maximize();
	// driver.get("http://www.google.co.in");
	   driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
	   Actions a=new Actions(driver);
		a.sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		//Page Up
		a.sendKeys(Keys.HOME).perform();
		Thread.sleep(5000);
	}

}
