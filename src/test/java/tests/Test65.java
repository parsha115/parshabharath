package tests;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test65 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yy-hh-mm-ss");
        driver.get("http://www.youtube.com");
        Date today=new Date();
        Date tomorrow=new Date(today.getTime()+(24*60*60*1000));
        Cookie.Builder b=new Cookie.Builder("session-id-time","magnitia");
        Cookie nc=b.domain("www.youtube.com").path("/").expiresOn(tomorrow).isSecure(true).build();
        driver.manage().addCookie(nc);
        Thread.sleep(4000);
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        System.out.println("count of cookies is "+l.size()+"-------"+s.size());
        System.out.println("-------------");
        for(Cookie c:l)
        {
        
        	System.out.println(c.getName()+"<-->"+c.getValue()+"<-->"+c.getDomain()+"<-->"+c.getExpiry());
        }
        driver.quit();
	}

}
