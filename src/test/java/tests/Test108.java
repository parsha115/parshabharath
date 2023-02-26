package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test108 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
       driver.switchTo().frame("iframeResult");
       driver.findElement(By.name("fname")).sendKeys("abdul");
       WebElement e=driver.findElement(By.name("fname"));
       e.sendKeys("kalam");
       e.submit();
       driver.quit();
	}

}
