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

public class Test179 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://stackoverflow.com/questions/38653910/actions-click-script-selenium");
		Actions act=new Actions(driver);
		WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath
				                                 ("//span[text()='package']/parent::code/parent::pre")));
		//(//pre[contains(@class,'lang-java')])[1]
		act.sendKeys(e,Keys.END).perform();
		Thread.sleep(5000);
		//Element Up
		act.sendKeys(e,Keys.HOME).perform();
		Thread.sleep(5000);
	}

}
