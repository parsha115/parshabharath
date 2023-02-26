package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test157 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("chrome://settings/");
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("settings-ui")));
		e.getShadowRoot().findElement(By.cssSelector("#toolbar")).getShadowRoot()
		.findElement(By.cssSelector("#search")).getShadowRoot().findElement(By.cssSelector("#searchInput"))
		.sendKeys("Abdul Kalam");	
	}

}
