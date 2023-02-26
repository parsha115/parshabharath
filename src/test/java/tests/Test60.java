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

public class Test60 {

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
        Thread.sleep(4000);
        /*driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        Thread.sleep(3000);
        driver.switchTo().window(l.get(1));
        driver.get("https://www.gmail.com");
        Thread.sleep(4000);*/
        Set<Cookie> t=driver.manage().getCookies();
        List<Cookie> m=new ArrayList<Cookie>(t);
        System.out.println("count of cookies is "+m.size());
        for(Cookie c:m)
        {
        	driver.manage().addCookie(c);
        	System.out.println(c.getName());
        }   
        driver.quit();
	}

	 

}
