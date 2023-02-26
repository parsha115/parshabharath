package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test86 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.google.com");
        WebElement e=driver.findElement(By.linkText("Gmail"));
        String x=e.getCssValue("text-decoration");
        System.out.println(x);
        Actions act=new Actions(driver);
        act.moveToElement(e).perform();
        Thread.sleep(5000);
        String y=e.getCssValue("text-decoration");
        System.out.println(y);
	}

}
