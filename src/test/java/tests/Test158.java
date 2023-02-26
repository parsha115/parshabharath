package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test158 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("http://www.facebook.com");
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		WebElement f=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(f))
		                                .sendKeys("siri1234");
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(e))
		                                .sendKeys("parsharam115@gmail.com");
		driver.findElement(RelativeLocator.with(By.tagName("button")).below(e)).click();
	}

}
