package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test178 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
	    //Change browser widow size to get scroll bars
		Dimension d=new Dimension(500,400); //width and height
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Scroll down
		//driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		driver.executeScript("window.scrollBy(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll up
		//driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	    driver.executeScript("window.scrollBy(0,-(document.body.scrollHeight));");
		Thread.sleep(5000);
				//Scroll right
		driver.executeScript("window.scrollBy(document.body.scrollWidth,0);");
		Thread.sleep(5000);
				//Scroll left
		driver.executeScript("window.scrollBy(-(document.body.scrollWidth),0);");
		Thread.sleep(5000);
		//Scroll to specific element in page
		WebElement e=driver.findElement(By.name("email"));
		driver.executeScript("arguments[0].scrollIntoView();",e);
		Thread.sleep(5000);
				//Close site
				
	}

}
