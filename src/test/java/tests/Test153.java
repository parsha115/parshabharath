package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test153 {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
         RemoteWebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
         wait.withTimeout(Duration.ofSeconds(20));
         wait.pollingEvery(Duration.ofMillis(1000));
         driver.get("http://www.google.co.in");
         Actions act=new Actions(driver);
         WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
         act.keyDown(Keys.SHIFT).perform();
         act.sendKeys("abdul kalam").perform();
         act.keyUp(Keys.SHIFT).perform(); 
            
	}

}
