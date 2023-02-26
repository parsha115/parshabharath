package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test99 {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("http://gmail.com");
       WebElement e=driver.findElement(By.id("identifierId"));
       String s=e.getText();
       System.out.println(s);
    /* String s1=e.getAttribute("input");
       String s2=e.getCssValue("inherit");
       System.out.println(s1);
       System.out.println(s2);  */
       int w=e.getRect().getWidth();
       int h=e.getRect().getHeight();
       int x=e.getRect().getX();
       int y=e.getRect().getY();
       System.out.println(w+" "+h+" "+x+" "+y);
       driver.quit();
	}

}
