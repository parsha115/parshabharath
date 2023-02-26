package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test165 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000)); 
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		driver.executeScript("arguments[0].disabled='true';",e1);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].disabled=false;",e1);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].setAttribute('type','checkbox');",e1);
		Thread.sleep(5000);
		WebElement e2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
				                                        ("(//*[name()='svg'])[4]/parent::div/parent::div")));
		driver.executeScript("arguments[0].remove();",e2);
		Thread.sleep(5000);
		WebElement e3=driver.findElement(By.xpath("//input[@name='q']/parent::div"));
		driver.executeScript(
				"var para=document.createElement('p');"
				+"var tn=document.createTextNode('Hi Batch261, please install JDK8');"
				+ "para.appendChild(tn); "
				+ "arguments[0].appendChild(para);",e3);
		Thread.sleep(5000);
		
	}

}
