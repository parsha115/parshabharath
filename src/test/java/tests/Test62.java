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
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test62 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.testyou.in/Login.aspx");
        Thread.sleep(3000);
        try
        {
        driver.findElement(By.xpath("(//img[starts-with(@style,'height')])[3]")).click();
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        }
        catch(Exception ex)
        {
        }
        Thread.sleep(5000);
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> st=driver.getWindowHandles();
        List<String> li=new ArrayList<String>(st);
        driver.switchTo().window(li.get(1));
        driver.get("http://www.testyou.in/Login.aspx");
        Set<Cookie> s=driver.manage().getCookies();
        List<Cookie> l=new ArrayList<Cookie>(s);
        SimpleDateFormat sf=new SimpleDateFormat("dd-mmm-yy-hh-mm-ss");
        System.out.println("count of cookies is "+l.size());
        System.out.println("----------------");
        for(Cookie c:l)
        {
        	driver.manage().addCookie(c);
        	System.out.println(c.getName());
        }
        
	}

}
