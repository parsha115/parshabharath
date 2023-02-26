package tests;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test67 {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.google.com");
        Set<String> s=driver.manage().logs().getAvailableLogTypes(); 
        System.out.println(s);
        System.out.println("-------------------");
        System.out.println("Browser logs");
        System.out.println("------------");
        LogEntries bl=driver.manage().logs().get("browser");
        for(LogEntry l:bl)
        {
        	System.out.println(l.getMessage());
        }
        System.out.println("Browser driver software logs");
        System.out.println("---------------------");
        LogEntries dl=driver.manage().logs().get("driver");
        for(LogEntry l:dl)
        {
        	System.out.println(l.getMessage());
        }
        System.out.println("client logs");
        System.out.println("------------");
        LogEntries cl=driver.manage().logs().get("client");
        for(LogEntry l:cl)
        {
        	System.out.println(l.getMessage());
        }
        
        driver.quit();
	}

}
