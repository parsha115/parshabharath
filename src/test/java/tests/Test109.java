package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test109 {

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
       WebElement x=e.findElement(By.xpath("child::tr[1]")).findElement(By.xpath("child::td[4]")).findElement(By.xpath("child::div[1]"));
       String s=(String)driver.executeScript("return(arguments[0].textContent);",x);
       System.out.println(s);
       String a[]=s.split(",");
       System.out.println(a[0].trim());
       System.out.println(a[1].trim());
       System.out.println(a[2].trim());
       System.out.println(a[3].trim());
       System.out.println(a[4].trim());
      // System.out.println(a[5].trim());
       driver.quit();
	}

}
