package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test160 {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
         RemoteWebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
         wait.withTimeout(Duration.ofSeconds(20));
         wait.pollingEvery(Duration.ofMillis(1000));
         driver.get("http://www.google.co.in");
         WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(
        		                                             By.xpath("//div[@class='CcAdNb']")));
         RelativeBy rb=RelativeLocator.with(By.name("q"));
         wait.until(ExpectedConditions.visibilityOfElementLocated(rb.near(e, 100)))
                                                                   .sendKeys("abdul kalam",Keys.ENTER);
	     
	}
}
