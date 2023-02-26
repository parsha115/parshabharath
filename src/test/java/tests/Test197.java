package tests;

import java.time.Duration;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test197 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input 1");
		String x=sc.nextLine();
		System.out.println("Enter input 2");
		String y=sc.nextLine();
		sc.close();
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("http://juliemr.github.io/protractor-demo");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model=\"first\"]")))
		                                                                   .sendKeys(x);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model=\"second\"]")))
		                                                                    .sendKeys(y);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gobutton"))).click();
		Pattern p=Pattern.compile("[-]?[0-9]+");
		wait.until(ExpectedConditions.textMatches(By.xpath("//h2[@class='ng-binding']"),p));
		String z=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
				                                             ("//h2[@class=\"ng-binding\"]"))).getText();
		System.out.println(z);
		driver.close();
	}

}
