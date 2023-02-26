package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test150 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		FluentWait<RemoteWebDriver> wait=new FluentWait<RemoteWebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(1000));
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
				        ("//a[text()='W3.CSS']")));
		String x=e.getAttribute("title");
		System.out.println(x);
		
		WebElement f=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
		              ("(//div[@class='tooltip'])[2]")));
		Actions act=new Actions(driver);
		act.clickAndHold(f).perform();
	    String y=f.findElement(By.xpath("child::span")).getText();
	    System.out.println(y);
	    act.release(f).perform();
		driver.close();
	}
}
