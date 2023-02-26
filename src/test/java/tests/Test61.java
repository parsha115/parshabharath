package tests;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test61 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver1.get("http://www.gmail.com");
        driver1.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(1000);
        driver1.findElement(By.xpath("//span[text()='Next']")).click();
        driver1.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//span[text()='Next']")).click();
        Set<Cookie> s=driver1.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        System.out.println("count of cookies is "+l.size());
        for(Cookie c:l)
        {
        	System.out.println(c.getName());
        }   
        Thread.sleep(4000);
        driver1.switchTo().newWindow(WindowType.WINDOW);
        WebDriverManager.edgedriver().setup();
        RemoteWebDriver driver2=new EdgeDriver();       
        Thread.sleep(3000);
        driver2.get("https://www.gmail.com");
        Thread.sleep(4000);
        for(Cookie c:l)
        	  try
              {
                  driver2.manage().addCookie(c);
              }
              catch(Exception ex)
              {
        	  }
        System.out.println("count of cookies is "+l.size());
        for(Cookie c:l)
        {
        	System.out.println(c.getName());
        }   
        driver1.quit();
        driver2.quit();
	}

	 
}
