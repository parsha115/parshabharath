package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.collect.ImmutableMap;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test209 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/geolocation");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Where am I?']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lat-value")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("long-value")));
		String lat1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lat-value"))).getText();
		String log1=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("long-value"))).getText();
		System.out.println(lat1+" "+log1);
		Thread.sleep(5000);
		DevTools dt=(((ChromeDriver) driver).getDevTools());
		dt.close();
	//	driver.executeScript("Emulation.setGeolocationOverride",
     //   		ImmutableMap.of("latitude",26.1248239,"longitude",-80.2655737,"accuracy", 1));
		((ChromiumDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride",
        		ImmutableMap.of("latitude",26.1248239,"longitude",-80.2655737,"accuracy", 1));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Where am I?']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lat-value")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("long-value")));
		String lat2=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lat-value"))).getText();
		String log2=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("long-value"))).getText();
		System.out.println(lat2+" "+log2);
		
		driver.close();
		
	}

}
