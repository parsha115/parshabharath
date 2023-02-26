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

public class Test166 {
	public static void main(String[] args) throws Exception
	{
		//Take value from keyboard
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter password value");
				String x=sc.nextLine();
				sc.close();
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofMillis(1000));
        driver.get("http://www.facebook.com");
        WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        e.sendKeys(x);
        driver.executeScript("arguments[0].setAttribute('type','text');",e);
        Thread.sleep(5000); 
		//Step-3: get that visible value
		String y=e.getAttribute("value");
		//Step-4: compare that visible value with given value
		if(x.equals(y))
		{
			System.out.println("Password masking Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		//close site
		driver.close();
	}

}
