package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test121 {

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.get("http://www.facebook.com");
       FluentWait<RemoteWebDriver> wait=new  FluentWait<RemoteWebDriver>(driver);
       wait.withTimeout(Duration.ofSeconds(20));
       wait.pollingEvery(Duration.ofMillis(1000));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("parsharam115@gmail.com");
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass"))).sendKeys("siri1234");
       wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).click();
       
	}

}
