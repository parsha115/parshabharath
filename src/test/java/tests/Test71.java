package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test71 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.amazon.com");
        List<WebElement> l=driver.findElements(By.xpath("//input"));
        System.out.println("count of input tag elemnts is "+l.size());
        System.out.println("----------------------------------");
        int crb=0;
        int ctb=0;
        int cpb=0;
        int ceb=0;
        int curl=0;
        int cdb=0;
        int ch=0;
        int csb=0;
        int img=0;
        int cb=0;
        int ct=0;
        int ccb=0;
        int cc=0;
        int file=0;
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
        	case "url":
        		curl++;
        		break;
        	case "dropdown":
        		cdb++;
        		break;
        	case "hidden":
        		ch++;
        		break;
        	case "submit":
        		csb++;
        		break;
        	case "image":
        		img++;
        		break;
        	case "color":
        		cc++;
        		break;
        	case "button":
        		crb++;
        		break;
        	case "tel":
        		ct++;
        		break;
        	case "file":
        		file++;
        		break;
        	case "checkbox":
        		ccb++;
        		break;
            default:
        		others++;
        		System.out.println(x);
        		
        	}
        }
	      System.out.println("count of radio buttons is "+crb);
	      System.out.println("count of text boxes is "+ctb);
	      System.out.println("count of password boxes is "+cpb);
	      System.out.println("count of email boxes is "+ceb);
	      System.out.println("count of dropdown boxes is "+cdb);
	      System.out.println("count of url boxes  is "+curl);
	      System.out.println("count of hidden elemnts is "+ch);
	      System.out.println("count of submit buttons is "+csb);
	      System.out.println("count of image buttons is "+img);
	      System.out.println("count of file buttons is "+file);
	      System.out.println("count of check boxes is "+ccb);
	      System.out.println("count of colors boxes is "+cc);
	      System.out.println("count of others "+others);
        
        driver.quit();
	}

}
