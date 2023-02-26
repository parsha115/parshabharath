package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test72 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("parsharam115@gmail.com");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        driver.findElement(By.name("password")).sendKeys("siri1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        List<WebElement> l1=driver.findElements(By.xpath("//input"));
        System.out.println("count of input tag elements is "+l1.size());
        System.out.println("-------------------------------------");
        int ccb=0;
        int ctb=0;
        int crb=0;
        int ceb=0;
        int cpb=0;
        int cu=0;
        int ct=0;
        int cb=0;
        int cdb=0;
        int others=0;
        int table=0;
        int frame=0;
        for(WebElement e:l1)
        {
        	String x=e.getAttribute("type");
        	switch(x)
        	{
        	case "checkbox":
        		ccb++;
        		break;
        	case "text":
        		ctb++;
        		break;
        	case "radio":
        		crb++;
        		break;
        	case "email":
        		ceb++;
        		break;
        	case "password":
        		cpb++;
        		break;
        	case "url":
        		cu++;
        		break;
        	case "tel":
        		ct++;
        		break;
        	case "button":
        		cb++;
        		break;
        	case "dropdown":
        		cdb++;
        		break;
        	case "table":
        		table++;
        		break;
        	case "frame":
        		frame++;
        		break;
        	default:
        		others++;
        		System.out.println(x);
        	}  	
        }
        
        	System.out.println("count of check boxes is "+ccb);
        	System.out.println("count of text boxes  is "+ctb);
        	System.out.println("count of radio buttons is "+crb);
        	System.out.println("count of email boxes is "+ceb);
        	System.out.println("count of password box is "+cpb);
        	System.out.println("count of url boxes is "+cu);
        	System.out.println("count of telephone box is "+ct);
        	System.out.println("count of buttons is "+cb);
        	System.out.println("count of dropdown boxes is "+cdb);
        	System.out.println("count of others is "+others);
        	System.out.println("count of tables is "+table);
        	System.out.println("count of frames  is "+frame);
         
        List<WebElement> l2=driver.findElements(By.xpath("//table"));
        System.out.println("count of tables tag element is "+l2.size());
        System.out.println("--------------------------------------");
        for(WebElement e:l2)
        {
        	System.out.println("count of tables is "+table);
        
        }
        List<WebElement> l3=driver.findElements(By.xpath("//iframe"));
        System.out.println("count of frames tag element is "+l3.size());
        System.out.println("-----------------------------------------");
        for(WebElement e:l3)
        {
        	System.out.println("count of frames  is "+frame);
        	
        }
        driver.quit();
        
	}

}
