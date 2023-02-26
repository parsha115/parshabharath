package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test122 {

	public static void main(String[] args) 
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com");
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(5000));
        wait.until(visibilityOfElementLocated(By.name("identifier"))).sendKeys("parsharam115@gmail.com");
        wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
        wait.until(visibilityOfElementLocated(By.name("Passwd"))).sendKeys("siri1234");
        wait.until(elementToBeClickable(By.xpath("//span[text()='Next']"))).click();
        wait.until(elementToBeClickable(By.xpath("//div[text()='Compose']"))).click();
        wait.until(visibilityOfElementLocated(By.name("to"))).sendKeys("parsharam115@yahoo.com");
        wait.until(visibilityOfElementLocated(By.name("subjectbox"))).sendKeys("Good Morning");
        wait.until(visibilityOfElementLocated(By.xpath("//div[@aria-label='Message Body']"))).sendKeys("hai bro");
        wait.until(presenceOfElementLocated(By.name("Filedata"))).sendKeys("C:\\Users\\Sirisha\\Downloads\\parsha115\\ORG.PARSHA\\target\\fullpagescreenshotmens.png");
        wait.until(invisibilityOfElementLocated(By.xpath("//div[starts-with(@aria-label,'Uploading')]")));
        wait.until(elementToBeClickable(By.xpath("(//div[starts-with(@aria-label,'Send')])[2]"))).click();
        wait.until(visibilityOfElementLocated(By.xpath("//a[starts-with(@aria-label,'Google Account')]"))).click();
        try
        {
        	wait.withTimeout(Duration.ofSeconds(5));
        	wait.until(frameToBeAvailableAndSwitchToIt("account"));
        	wait.until(visibilityOfElementLocated(By.linkText("Sign out"))).click();
        }
        catch(Exception ex)
        {
        	wait.until(visibilityOfElementLocated(By.linkText("Sign out"))).click();
        }
        driver.close();
        
	}

}
