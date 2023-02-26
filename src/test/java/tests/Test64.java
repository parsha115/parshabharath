package tests;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test64 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://www.google.com");
       Cookie cc=new Cookie("magnitia","abdulkalam");
       driver.manage().addCookie(cc);
       Set<Cookie> s=driver.manage().getCookies();
       List<Cookie> l=new ArrayList<Cookie>(s);
       SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yy-hh-mm-ss");
       System.out.println("count of cookies is "+l.size()+"--l.size--and--s.size--"+s.size());
       System.out.println("-----------------");
       for(Cookie c:l)
       {
    	   driver.manage().addCookie(cc);
    	   System.out.println(c.getName()+" expires on "+c.getExpiry()+"-----"+c.getValue()+"-------"+c.getDomain());
       }
       driver.close();
       driver.quit();
	}

}
