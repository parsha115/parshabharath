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

public class Test149 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(
				"//iframe[@class='demo-frame']")));
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//span[@class='ui-slider-handle ui-corner-all ui-state-default']")));
		Actions act=new Actions(driver);
		act.dragAndDropBy(e,0,100).perform();
		Thread.sleep(5000);
		act.dragAndDropBy(e,0,-300).perform();
		driver.close();
	}

}
