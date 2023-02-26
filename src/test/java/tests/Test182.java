package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test182 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev");
        Thread.sleep(5000);
		//Zoom in(using JavaScript)
		driver.executeScript("document.body.style.zoom='200%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='100%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='500%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='50%';");
		Thread.sleep(5000);
		driver.executeScript("document.body.style.zoom='0%';");
		
	}

}
