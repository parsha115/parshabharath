package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement e=driver.findElement(By.id("email"));
		e.sendKeys("parsharam115@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("siri1234");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.close();
		
	}
	
	}
