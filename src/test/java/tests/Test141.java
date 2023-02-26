package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test141 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver); 
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
				     ("(//div[contains(@class,'dropdown selection multiple')])[1]")));
		e.click();
		Thread.sleep(3000);
		List<WebElement> l=e.findElements(By.xpath("child::div[2]/div"));
		
		for(WebElement item:l)
		{
			
			Thread.sleep(2000);
			item.click();
			Thread.sleep(2000);
		}
		List<WebElement> selecteditems=e.findElements(By.xpath("child::a"));
		 for(WebElement item:selecteditems)
		  {
		   	item.findElement(By.xpath("child::i")).click();
			Thread.sleep(2000);
		  }
		
		driver.close();
	}

}
