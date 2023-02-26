package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test110 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://www.gmail.com");
       driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[text()='Next']")).click();
       driver.findElement(By.name("Passwd")).sendKeys("siri1234");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//span[text()='Next']")).click();
       Thread.sleep(5000);
       WebElement e=driver.findElement(By.xpath("(//table)[6]/tbody"));
       WebElement x=e.findElement(By.xpath("child::tr")).findElement(By.xpath("child::td[4]")).findElement(By.xpath("child::div"));
       String s=(String)driver.executeScript("return(arguments[0].textContent);",x);
       System.out.println(s);
       String a[]=s.split(",");
       System.out.println(a[0].trim());
       System.out.println(a[1].trim());
       System.out.println(a[2].trim());
       System.out.println(a[3].trim());
       System.out.println(a[4].trim());
       System.out.println(a[5].trim());
       System.out.println(a[6].trim());
       List<WebElement> l=driver.findElements(By.xpath("(//table)[6]/tbody/tr/td[4]/div"));
       String t=(String)driver.executeScript("return(arguments[0].textContent);",l);
       System.out.println(t);
       for(int i=1; i<=50; i++)
       {
    	   String b[]=t.split(",");
           System.out.println(b[0].trim());
           System.out.println(b[1].trim());
           System.out.println(b[2].trim());
           System.out.println(b[3].trim());
           System.out.println(b[4].trim());
           System.out.println(b[5].trim());
           System.out.println(b[6].trim());
       }
       driver.quit();
	}

}
