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

public class Test144 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("http://www.amazon.co.in");
    	Actions act=new Actions(driver);
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
				     ("//a[text()='Mobiles']")));
	/*	act.moveToElement(e).perform();
	    act.click().perform();
		act.moveToElement(e,10,10).perform();
		act.doubleClick().perform(); */
		
		Thread.sleep(3000);
		act.moveToElement(e).perform();
		act.click().perform();
        Thread.sleep(3000);
		act.moveByOffset(90,0).perform();
		act.click().perform();
		Thread.sleep(3000);
		act.moveByOffset(-180,0).perform();
		act.click().perform();
		Thread.sleep(3000); 
        driver.close(); 
	}

}
