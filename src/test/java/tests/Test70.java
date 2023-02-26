package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test70 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://dev.worke.io/register");
       List<WebElement> l=driver.findElements(By.xpath("//input"));
       System.out.println("count of input tag elemnts is "+l.size());
       System.out.println("--------------");
       int crb=0;
       int ctb=0;
       int cpb=0;
       int ceb=0;
       int ccb=0;
       int cu=0;
       int ct=0;
       int others=0;
        for(WebElement e:l)
        {
        	String x=e.getAttribute("type");
            switch(x)
            {
            case "radio":
            	crb++;
            	break;
            case "text":
            	ctb++;
            	break;
            case "password":
                 cpb++;
                 break;
            case "email":
            	ceb++;
            	break;
            case "checkbox":
            	ccb++;
            	break;
            case "url":
            	cu++;
            	break;
            case "tel":
            	ct++;
            	break;
            default:
            	others++;
            	System.out.println(x);
            	
            }
            
        }
        System.out.println("count of radio buttions is "+crb);
        System.out.println("count of textbox buttons is "+ctb);
        System.out.println("count of password boxes is "+cpb);
        System.out.println("count of email boxes is "+ceb);
        System.out.println("count of check boxes is "+ccb);
        System.out.println("count of url boxes is "+cu);
        System.out.println("count of telephone boxes is "+ct);
        System.out.println("count of others is "+others);
        
        driver.quit();
	}

}
