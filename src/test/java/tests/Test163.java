package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test163 {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.get("http://www.facebook.com");
        WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        driver.executeScript("arguments[0].style.border='10px green groove';",e);
        driver.executeScript("arguments[0].style.background='yellow';",e);
        driver.executeScript("arguments[0].style.color='red';",e);
        driver.executeScript("arguments[0].value='parsharam115@gmail.com';",e);
        WebElement f=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
        driver.executeScript("arguments[0].style.border='10px blue ridge';",f);
        driver.executeScript("arguments[0].style.background='pink';",f);
        driver.executeScript("arguments[0].style.color='brown';",f);
        driver.executeScript("arguments[0].value='siri1234';",f);
        
	}

}
