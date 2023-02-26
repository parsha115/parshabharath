package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test125 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("http://www.google.co.in");
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(2000));
        ExpectedCondition<WebElement> ec1=elementToBeClickable(By.name("q"));
        ExpectedCondition<WebElement> ec2=elementToBeClickable(By.linkText("Gmail"));
        wait.until(and(ec1,ec2));
        driver.close();
	}

}
