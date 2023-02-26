package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test74 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.flipkart.com");
        driver.findElement(By.xpath("(//span[text()='Login'])[1]/ancestor::div[4]/child::button")).click();
        List<WebElement> l=driver.findElements(By.xpath("//*"));
        int alllinks=0;
        int correctlinks=0;
        int brokenlinks=0;
        for(WebElement e:l)
        {
        	try
        	{
        	if(e.getAttribute("href")!=null)
        	{
        		String x=e.getAttribute("href");
        		if(x.startsWith("https")||x.startsWith("http"))
        		{
        			alllinks++;
        			URL u=new URL(x);
        			HttpURLConnection con=(HttpURLConnection)u.openConnection();
        			con.connect();
        			if(con.getResponseCode()==200)
        			{
        				correctlinks++;
        			}
        			else
        			{
        				brokenlinks++;
        				System.out.println(x+"is broken link due to "+con.getResponseMessage());
        			}
        		}
        	}
        		
        	}
        	catch(StaleElementReferenceException ex)
        	{
        		
        	}
        }
        System.out.println("count of all links is "+alllinks);
        System.out.println("count of correct links is "+correctlinks);
        System.out.println("count of broken links is "+brokenlinks);
        
        driver.quit();
	}

}
