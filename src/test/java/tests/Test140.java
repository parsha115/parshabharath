package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test140 {

	public static void main(String[] args) throws Exception
	{
	    WebDriverManager.chromedriver().setup();
	    RemoteWebDriver driver=new ChromeDriver();
	    FluentWait<RemoteWebDriver> wait=new  FluentWait<RemoteWebDriver>(driver);
	    wait.withTimeout(Duration.ofSeconds(20));
	    wait.pollingEvery(Duration.ofMillis(1000));
	    driver.get("https://semantic-ui.com/modules/dropdown.html");
	    WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
	    		                            ("(//div[contains(@class,'selection dropdown')])[2]")));
	    e.click();
	    Thread.sleep(2000);
	    for(int i=1;i<6;i++)
	    {
	    	 e.findElement(By.xpath("child::div[2]/div["+i+"]")).click();
	    	 Thread.sleep(2000);
	    	 e.click();
	    	 Thread.sleep(2000);
	    }
	    System.out.println("names of select friends is :------");
	    System.out.println(e.getText());
	    driver.close();
	}

}
