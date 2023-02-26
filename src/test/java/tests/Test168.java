package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test168 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://semantic-ui.com/modules/dropdown.html"); 
		Thread.sleep(5000);
		//Locate hidden element and get text(Using JavaScript)
		WebElement he=driver.findElement(By.xpath("(//div[text()='Gender']/following-sibling::div/div)[1]"));
		String x=he.getText();
		System.out.println(x); //null value
		String y=(String) driver.executeScript("return(arguments[0].textContent);",he);
		System.out.println(y); //original value
	}

}
