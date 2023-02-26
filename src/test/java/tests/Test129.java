package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test129 {

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
       wait.withTimeout(Duration.ofSeconds(20));
       wait.pollingEvery(Duration.ofMillis(1000));
       driver.get("http://www.gmail.com");
       wait.until(waitandfill(By.name("identifier"),"parsharam115@gmail.com"));
       wait.until(waitandclick(By.xpath("//span[text()='Next']")));
       wait.until(waitandfill(By.name("Passwd"),"siri1234"));
       wait.until(waitandclick(By.xpath("//span[text()='Next']")));
	
	}

	public static ExpectedCondition<Boolean> waitandclick( By b)
	{
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>() 
		{
	        public Boolean apply(WebDriver driver) 
	        {
	        	try 
	           	{
	        	   driver.findElement(b).click();
	        	   return(true);
	            } 
	            catch(Exception ex) 
	            {
	            	return(false);
	            }
	         }
	    };
	    return(ec);
	}
		
	public static ExpectedCondition<Boolean> waitandfill(By b, String x)
	{
		ExpectedCondition<Boolean> ec=new ExpectedCondition<Boolean>() 
		    {
	            public Boolean apply(WebDriver driver) 
	            {
	            	try 
	            	{
	            		driver.findElement(b).sendKeys(x);
	            		return(true);
	            	} 
	            	catch(Exception ex) 
	            	{
	            		return(false);
	            	}
	            }
	        };
	    return(ec);
	}

}
