package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test145 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_before");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("iframeResult")));
		Actions act=new Actions(driver);
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
			         	 ("(//h1[text()='This is a heading'])[1]")));
		act.moveToElement(e).perform();
		act.moveByOffset(-50,0).perform();
		act.contextClick(e).perform();
		Thread.sleep(5000);
	/*	WebElement f=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
	         	         ("(//h1[text()='This is a heading'])[2]")));
		act.moveToElement(f).perform();
		act.moveByOffset(-50,0).perform();
		act.contextClick(f).perform();  */
		
		
		
	}

}
