package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test154 {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.get("http://www.facebook.com");
        Duration d=Duration.ofSeconds(5);
        Actions act=new Actions(driver);
        WebElement e=driver.findElement(By.name("pass"));
        act.sendKeys("parsharam115@gmail.com",Keys.TAB).pause(d).moveToElement(e).pause(d).sendKeys("siri1234",
        	Keys.TAB,Keys.TAB,Keys.ENTER).build().perform();
	}

}
