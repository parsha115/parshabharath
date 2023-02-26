package tests;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test195 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name");
		String x=sc.nextLine();
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
        driver.get("https://angularjs.org");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model=\"yourName\"]")))
                    .sendKeys(x);
        try
        {
           String y=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
        		      ("//h1[@class=\"ng-binding\"]"))).getText();
           System.out.println(y);
           wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Hello "+x+"!']")));
           System.out.println("Test passed");  	
        }
        catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        	System.out.println("Test failed");
        }
        driver.close();
	}

}
