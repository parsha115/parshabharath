package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test57 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        for(Cookie c:l)
       {
	     if(c.isHttpOnly())
	     {
	       //when protocal is HTTP
	       if(c.getName().equalsIgnoreCase("session-id")) //c.getName().contains("SID")
	       {
	    	 System.out.println(c.getName()+"is HTTP-Only session cookie");
	       }
	       else if(c.getName().equalsIgnoreCase("session-id-time"))
	       {
	    	 System.out.println(c.getName()+"is HTTP-Only presistent cookie it expires on "+c.getExpiry());
	       }
	       else
	       {
	    	 System.out.println(c.getName()+"is HTTP-Only cookie");
	       }
	     }
	     else if(c.isSecure())
	     {
	      //when protocal is HTTPS
	      if(c.getName().equalsIgnoreCase("session-id")) // c.getName().contains("SID")
	      {
	    	System.out.println(c.getName()+"is secured session cookie");
	      }
	      else if(c.getName().equalsIgnoreCase("session-id-time"))
	      {
	    	System.out.println(c.getName()+"is secured presistent cookie it expires on "+c.getExpiry());
	      }
	      else
	      {
	         System.out.println(c.getName()+"is pure secured cookie only");
	      }
	     }
	     else if(c.getDomain().contains("gmail.com"))
	     {
	        System.out.println(c.getName()+"is Samte-Site cookie"); 
	     }
	     else if(c.getDomain().contains("google.com"))
	     {
	    	System.out.println(c.getName()+"is Super cookie");
	     }
	     else
	     {
	    	System.out.println(c.getName()+"is Third-Party cookie and its come from "+c.getDomain());
	     }
       }
        driver.quit();
	}

}
