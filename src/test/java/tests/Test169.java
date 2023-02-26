package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test169 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://www.google.co.in");
		WebElement e=driver.findElement(By.id("SIvCob"));
		String x=e.getText();
		System.out.println(x);
		System.out.println("-------------");
	    Thread.sleep(5000);
		String y=(String) driver.executeScript("return(arguments[0].childNodes[0].textContent);",e);
		System.out.println(y);
		driver.close();
	}

}
