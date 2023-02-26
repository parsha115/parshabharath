package tests;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test54 {

	public static void main(String[] args)  throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        System.out.println("launch goole site and Count of cookies is "+l.size());
        System.out.println("------------------");
        SimpleDateFormat sf=new SimpleDateFormat("dd-MMM-yy-hh-mm-ss");
		for(Cookie c:l)
		{
			System.out.println(c.getName()+" expires on "+ sf.format(c.getExpiry()));
		}
        driver.get("http://www.facebook.com");
        s=driver.manage().getCookies();
        l=new ArrayList<Cookie>(s);
        System.out.println("lanuch facebook site and Count of cookies is "+l.size());
        System.out.println("------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expires on "+ sf.format(c.getExpiry()));
        }
        driver.findElement(By.id("email")).sendKeys("parsharam115@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("siri1234");
        driver.findElement(By.name("login")).click();
        s=driver.manage().getCookies();
        l=new ArrayList<Cookie>(s);
        System.out.println("open facebook site and Count of cookies is "+l.size());
        System.out.println("------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expiers on "+ sf.format(c.getExpiry()));
        }
        driver.findElement(By.xpath("(//div[contains(@role,'button')])[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Log Out']")).click();
        s=driver.manage().getCookies();
        l=new ArrayList<Cookie>(s);
        
        System.out.println("logout facebook site and Count of cookies is "+l.size());
        System.out.println("------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expires on "+ sf.format(c.getExpiry()));
        }
        //close site
        driver.quit();
	}

}
