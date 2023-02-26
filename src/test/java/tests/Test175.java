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

public class Test175 {

	public static void main(String[] args) throws Exception
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a word/sentences");
	  String x=sc.nextLine();
	  System.out.println("Enter a target word/sentences");
	  String y=sc.nextLine();
	  sc.close();
	  WebDriverManager.chromedriver().setup();
	  RemoteWebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(20));
	  wait.pollingEvery(Duration.ofMillis(1000));
	  driver.get("http://www.google.co.in"); 
		
	  Pattern p=Pattern.compile("[I][n][d][i][a]");
	  Matcher m=p.matcher("India won 2nd world cup in india in 2011");
	  int noow=0;
	  while(m.find())
		{
	    	noow++;
	    	System.out.println(m.group());
		}
			System.out.println("Total count of results is "+noow);
	
			System.out.println("-------------------");
			
		Pattern p1=Pattern.compile("[I][n][d][i][a]",Pattern.CASE_INSENSITIVE);
		Matcher m1=p1.matcher("India won 2nd world cup in india in 2011");
		int noow1=0;
		while(m1.find())
		  {
			 noow1++;
			 System.out.println(m1.group());
		  }
		     System.out.println("Total count of results is "+noow1);
				
	}

}
