package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test84 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.flipkart.com");
        driver.findElement(By.name("q")).sendKeys("mobile",Keys.chord(Keys.CONTROL,"a"),Keys.BACK_SPACE);
        driver.findElement(By.name("q")).clear();
	}

}
