package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test113 {

	public static void main(String[] args)  throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.gmail.com");
        WebElement e=driver.findElement(By.id("identifierId"));
        String a=e.getAttribute("aria-label");
        String b=e.getAttribute("type");
        System.out.println(a);
        System.out.println(b);
        
        String x=e.getDomAttribute("aria-label");
        String y=e.getDomProperty("type");
        System.out.println(x);
        System.out.println(y);
        driver.quit();
	}

}
