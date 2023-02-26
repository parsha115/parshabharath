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

public class Test146 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//  Actions act = new Actions(driver);
	//	act.doubleClick().perform();
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated
				     (By.xpath("//button[text()='Double-Click Me To See Alert']")));
		Actions act=new Actions(driver);
		act.doubleClick(e).perform(); 
	}

}
