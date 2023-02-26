package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test128 {

	public static void main(String[] args) 
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.get("http://www.gmail.com");
        WebElement e=wait.until(visibilityOfElementLocated(By.id("identifierId")));
        e.sendKeys("parsharam115@gmail.com");
        wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
        e=wait.until(visibilityOfElementLocated(By.name("Passwd")));
        e.sendKeys("siri1234");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        if(wait.until(stalenessOf(e)))
		{
			//Relocate element if that element is staled
			 e=wait.until(refreshed(visibilityOfElementLocated(By.name("Passwd"))));
        	 e.sendKeys("siri1234");
		} 
        wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
        driver.close();
	}

}
