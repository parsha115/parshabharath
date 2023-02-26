package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bharath2 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver1=new ChromeDriver();
		for(int i=1;i<=10;i++)
		{
			driver1.get("https://www.youtube.com/watch?v=VUWW-_vJjlY&ab_channel=YOLO");
			driver1.switchTo().newWindow(WindowType.TAB);
		}
		
		Set<String> s1=driver1.getWindowHandles();
		List<String> a1=new ArrayList<String>(s1);
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver2=new EdgeDriver();
		for(int i=1;i<=10;i++)
		{
		    driver2.switchTo().newWindow(WindowType.TAB);
		    driver2.get("https://www.youtube.com/watch?v=VUWW-_vJjlY&ab_channel=YOLO");
		}
		
		Set<String> s2=driver2.getWindowHandles();
		List<String> a2=new ArrayList<String>(s2); 
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver3=new FirefoxDriver();
		for(int i=1;i<=10;i++)
		{
		    driver3.switchTo().newWindow(WindowType.TAB);
		    driver3.get("https://www.youtube.com/watch?v=VUWW-_vJjlY&ab_channel=YOLO");
		}
		
		Set<String> s3=driver3.getWindowHandles();
		List<String> a3=new ArrayList<String>(s3); 
		WebDriverManager.operadriver().setup();
		RemoteWebDriver driver4=new OperaDriver();
		for(int i=0;i<=10;i++)
		{
		    driver4.switchTo().newWindow(WindowType.TAB);
		    driver4.get("https://www.youtube.com/watch?v=VUWW-_vJjlY&ab_channel=YOLO");
		}
      

		Set<String> s4=driver3.getWindowHandles();
		List<String> a4=new ArrayList<String>(s3); 
		WebDriverManager.iedriver().setup();
		RemoteWebDriver driver5=new InternetExplorerDriver();
		for(int i=0;i<=10;i++)
		{
		    driver5.switchTo().newWindow(WindowType.TAB);
		    driver5.get("https://www.youtube.com/watch?v=VUWW-_vJjlY&ab_channel=YOLO");
		}
      
	}

}
