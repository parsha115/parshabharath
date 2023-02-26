package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test130 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.get("http://www.amazon.co.in");
        wait.until(visibilityOfElementLocated(By.id("nav-search-dropdown-card")));
        WebElement e=driver.findElement(By.id("searchDropdownBox"));
        Select s=new Select(e);
        if(s.isMultiple())
        {
        	 System.out.println("Dropdown is multiple");
        }
        else
        {
        	System.out.println("Dropdown is single");
        }
        System.out.println("----------------------");
        List<WebElement> l=s.getOptions();
        System.out.println("count of items is : "+l.size());
		for(WebElement item:l)
        {
        	System.out.println(item.getText());
        }
		Thread.sleep(5000);
		s.selectByIndex(9);
		Thread.sleep(5000);
		s.selectByVisibleText("Books");
        Thread.sleep(5000);
		s.selectByValue("search-alias=toys");
		Thread.sleep(5000);
		driver.close();
		
	}
	

}
