package tests;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test170 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("http://www.google.co.in");
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher("India won 2nd world cup in india in 2011");
		//Get count of target word's occurrences 
		int noow=0;
		while(m.find())
		{
			noow++;
			System.out.println(m.group());
		}
		System.out.println("Total count of results is "+noow);
		//driver.close();
	}

}
