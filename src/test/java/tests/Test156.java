package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test156 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("http://www.facebook.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email")))
		                                                         .sendKeys("parsharam115@gmail.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pass")))
		                                                                         .sendKeys("siri1234");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[name='login']"))).click();
	}

}
