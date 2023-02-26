package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test190 {
	
    public static void main(String[] args) 
    {
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(2000));
	   driver.manage().window().maximize();
	   driver.get("http://rangeslider.js.org");
	   String value1=wait.until(ExpectedConditions.visibilityOfElementLocated
			                           (By.className("rangeslider__fill"))).getCssValue("background-color");
	   System.out.println(value1);
	   
	   String val=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className
			          ("rangeslider__handle"))).getCssValue("background-color");
	   System.out.println(val);
	   
	   String value2=(String) driver.executeScript("var ne=document.querySelector('div.rangeslider__handle');"
						  + "var pe=window.getComputedStyle(ne,'::after'); "
						  + "var y=pe.getPropertyValue('color');"
						  + "return(y);");
	   System.out.println(value2);
	   
	   String value3=(String) driver.executeScript("var ne=document.querySelector('div.rangeslider__handle');"
			                  + "var pe=window.getComputedStyle(ne,'::after'); "
			                  + "var y=pe.getPropertyValue('border-color');"
			                  + "return(y);");
		System.out.println(value3);
		
		String value4=(String) driver.executeScript("var ne=document.querySelector('div.rangeslider__handle');"
			                  + "var pe=window.getComputedStyle(ne,'::after'); "
			                  + "var y=pe.getPropertyValue('background-color');"
			                  + "return(y);");
		System.out.println(value4);
			   
   }
}
