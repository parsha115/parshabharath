package tests;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test56 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.yahoo.com");
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        System.out.println("open yahoo site and count of cookies is "+l.size());
        System.out.println("--------------------");
        SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yy-hh-mmm-ss");
        Thread.sleep(3000);
        for(Cookie c:l)
        {
        	System.out.println(c.getName());
        }
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[contains(@title,'Mail')]")).click();
        try
        {
        	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        }
        catch(Exception ex)
        {
        	
        }
        driver.findElement(By.name("username")).sendKeys("parsharam115@yahoo.com");
        driver.findElement(By.name("signin")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234SHOBHA");
        driver.findElement(By.name("verifyPassword")).click();
        System.out.println("login yahoo site and count of cookies is "+l.size());
        System.out.println("--------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName());
        }
        driver.findElement(By.xpath("//img[contains(@alt,'Profile image')]/parent::div")).click();
        driver.findElement(By.xpath("//span[text()='Sign out']")).click();
        System.out.println("logout yahoo site and count of cookies is "+l.size());
        System.out.println("--------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName());
        }
        driver.quit();
        
	}

}
