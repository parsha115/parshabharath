package tests;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test187 {

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a value to set ");
	   int x=sc.nextInt();
	   sc.close();
	   WebDriverManager.chromedriver().setup();
	   RemoteWebDriver driver=new ChromeDriver();
	   FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	   wait.withTimeout(Duration.ofSeconds(20));
	   wait.pollingEvery(Duration.ofMillis(2000));
	   driver.manage().window().maximize();
	   driver.get("http://rangeslider.js.org");
	   WebElement slider=wait.until(ExpectedConditions.presenceOfElementLocated(
                                                               By.xpath("//input[@type='range']")));
	   driver.executeScript("$(arguments[0]).val("+x+").change();",slider);
	   WebElement slideroutput=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id
			                                                                          ("js-output")));
	   int y=Integer.parseInt(slideroutput.getText());
	   x=(int)(Math.round(x/10.0)*10); 
		if(x==y)
		{
			System.out.println("Test passed");
       }
       else
       {
       	System.out.println("Test failed");
       }
	}

}
