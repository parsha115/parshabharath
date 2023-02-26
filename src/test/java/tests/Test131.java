package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test131 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
       wait.withTimeout(Duration.ofSeconds(20));
       wait.pollingEvery(Duration.ofMillis(1000));
       driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
       wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("iframeResult")));
       WebElement e=driver.findElement(By.name("cars"));
       System.out.println(e.getText());
       System.out.println("-------------------");
       Select s=new Select(e);
       if(s.isMultiple())
		{
			System.out.println("Multi select drop down");
		}
		else
		{
			System.out.println("Single select drop down");
		}
       List<WebElement> items=s.getOptions();
		System.out.println("count of tems is "+items.size());
		for(WebElement item:items)
		{
			System.out.println(item.getText());
		}
       Actions act=new Actions(driver);
       act.keyDown(Keys.CONTROL)
          .click(s.getOptions().get(0))
          .click(s.getOptions().get(1))
          .click(s.getOptions().get(2))
          .click(s.getOptions().get(3))
          .keyUp(Keys.CONTROL)
          .build().perform();
       List<WebElement> l=s.getAllSelectedOptions();
       System.out.println("count of items is : "+l.size());
       for(WebElement item:l)
       {
    	   System.out.println(item.getText());
       }
       Thread.sleep(5000);
       System.out.println("-----------");
       WebElement fe=s.getFirstSelectedOption();
       System.out.println(fe.getText());
       Thread.sleep(5000);
       System.out.println("------------");
       s.deselectByIndex(1);
       Thread.sleep(5000);
       System.out.println("--");
       s.deselectByVisibleText("Saab");
       Thread.sleep(5000);
       System.out.println("----");
       s.deselectByValue("opel");
       Thread.sleep(5000);
       System.out.println("-----------");
       s.deselectAll();
       driver.close();
	}

}
