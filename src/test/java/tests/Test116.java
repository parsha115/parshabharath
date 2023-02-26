package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test116 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("chrome:/settings");
       driver.findElement(By.tagName("settings-ui")).getShadowRoot().findElement(By.id("toolbar")).getShadowRoot()
              .findElement(By.id("search")).getShadowRoot().findElement(By.id("searchInput")).sendKeys("Abdul Kalam");
       driver.quit();
	}

}
