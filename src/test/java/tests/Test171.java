package tests;

import java.time.Duration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test171 {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word/sentence to be searched");
		String x=sc.nextLine();
		System.out.println("enter a target word/sentence/regular epression");
		String y=sc.nextLine();
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("http://www.google.co.in");
	    WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	    e.sendKeys(x,Keys.ENTER);
	    int currentpageindex=1;
		int total=0;
		while(true)
		{
			try
			{
			String z=(String) driver.executeScript(
					                   "return(document.documentElement.innerText);");
			Pattern p=Pattern.compile(y,Pattern.CASE_INSENSITIVE);
			Matcher m=p.matcher(z);
			int noow=0;
			while(m.find())
			{
				noow++;
			}
				total=total+noow;
				System.out.println(currentpageindex+"th page consists of "+noow);
				driver.findElement(By.xpath("//a[text()='"+(currentpageindex+1)+"']")).click();
				Thread.sleep(2000); 
				currentpageindex++;
			  }
			
			catch(Exception ex)
			{
				break; //terminate from current loop
			}
		}
			System.out.println("Total count of results is "+total);
			//close site
			driver.close();
		
	}

}
