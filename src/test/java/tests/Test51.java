package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test51 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
        driver.get("http://www.google.com");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.findElement(By.name("q")).sendKeys("APJ abdul kalam",Keys.ENTER);
        driver.quit();
        
        
	}

}
