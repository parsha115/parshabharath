package tests;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test189 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a min value");
		int min=sc.nextInt();
		System.out.println("Enter a max value");
		int max=sc.nextInt();
		sc.close();
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(2000));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/slider/#range");
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
        WebElement minSlider=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
        			                                 ("(//div[contains(@id,'slider-range')]/span)[1]")));
        while(true)
        {
           WebElement amount=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
           String temp=amount.getAttribute("value");
           System.out.println(temp);
           if(temp.contains("$"+min) || temp.contains("$"+(min-1)))
           {
        	   break;
           }
           else
           {
        	   Actions act=new Actions(driver);
        	   act.dragAndDropBy(minSlider,1,0).perform();       	   
           }
        }
        WebElement maxSlider=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                                                          ("(//div[contains(@id,'slider-range')]/span)[2]")));
        while(true)
        {
        	WebElement amount=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
        	String temp=amount.getAttribute("value");
        	System.out.println(temp);
        	if(temp.contains("$"+max) || temp.contains("-$"+(max-1)))
        	{
        		break;
        	}
        	else
        	{
        		Actions act=new Actions(driver);
        		act.dragAndDropBy(maxSlider,1,0).perform();
        	}
        }
	}

}
