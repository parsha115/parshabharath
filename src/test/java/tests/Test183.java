package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test183 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(2000));
        driver.manage().window().maximize();
        driver.executeScript("window.alert('site is ready to launch');");
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
		driver.get("https://www.google.co.in");
		driver.executeScript("window.alert('going to search a word');");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.name("q")).sendKeys("Abdul kalam",Keys.ENTER);
		//close site
		driver.executeScript("window.alert('site is going to close');");
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		
	}

}
