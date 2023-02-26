package tests;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test55 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.gmail.com");
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        System.out.println("open gmail site and count of cookies is "+l.size());
        System.out.println("------------------");
        SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yy-hh-mm-ss");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expires on "+sf.format(c.getExpiry()));
        }
        Thread.sleep(5000);
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        s=driver.manage().getCookies();
        l=new ArrayList<Cookie>(s);
        System.out.println("login gmail site and count of cookies is "+l.size());
        System.out.println("------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expires on "+sf.format(c.getExpiry()));
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account')]")).click();
        driver.switchTo().frame("account");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[text()='Sign out']")).click();
        s=driver.manage().getCookies();
        l=new ArrayList<Cookie>(s);
        System.out.println("logout gmail site and count of cookies is "+l.size());
        System.out.println("----------------------");
        for(Cookie c:l)
        {
        	System.out.println(c.getName()+" expires on "+sf.format(c.getExpiry()));
        }
        
        driver.quit();
	}

}
