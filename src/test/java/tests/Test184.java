package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test184 {

	public static void main(String[] args) throws Exception
	{
	  WebDriverManager.chromedriver().setup();
	  RemoteWebDriver driver=new ChromeDriver();
	  FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(20));
	  wait.pollingEvery(Duration.ofMillis(2000));
	  driver.manage().window().maximize();
	  driver.get("http://www.gmail.com");
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId"))).
	                                                             sendKeys("parsharam115@gmail.com");
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd"))).
                                                                 sendKeys("siri1234");
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Compose']"))).click();
      
      Thread.sleep(5000);
      driver.executeScript("history.go(0);");	//0 means forcibly clean
	}

}
