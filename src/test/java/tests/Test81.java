package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test81 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://www.facebook.com");
       driver.findElement(By.name("email")).sendKeys("parsharam115@gmail.com",Keys.chord(Keys.CONTROL,"a"),Keys.CONTROL,"c",Keys.BACK_SPACE);
       Thread.sleep(5000);
       driver.findElement(By.name("pass")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
