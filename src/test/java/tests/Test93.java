package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test93 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.google.com");
        WebElement e=driver.findElement(By.name("q"));
        if(e.isDisplayed())
        {
        	System.out.println("Element is visible in page");
        if(e.isEnabled())
        {
        	System.out.println("Element is enabled in page");
        }
        else
        {
        	System.out.println(" Element is not enabled in page");
        }
	    }
        else 
        {
        	System.out.println("Element is not visible in page");
        }
        driver.quit();
	}

}
