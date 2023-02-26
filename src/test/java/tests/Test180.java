package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test180 {

	public static void main(String[] args) throws Exception
	{		
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
       wait.withTimeout(Duration.ofSeconds(20));
       wait.pollingEvery(Duration.ofMillis(2000));
       driver.manage().window().maximize();
       driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
       Thread.sleep(5000);
		//Page scroll down to get visibility of element
		Actions act=new Actions(driver);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
		}
		//Element scroll down
		WebElement e=driver.findElement(By.xpath("//span[text()='package']/parent::code/parent::pre"));
		for(int i=1;i<=10;i++)
		{
		 act.sendKeys(e,Keys.ARROW_DOWN).perform();
		 Thread.sleep(1000);
		}
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(e,Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(e,Keys.ARROW_RIGHT).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(e,Keys.ARROW_LEFT).perform();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
		}
	}

}
