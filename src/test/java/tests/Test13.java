package tests;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		RemoteWebDriver driver=new EdgeDriver();
		driver.get("http://shine.in");
		String x=driver.getCurrentUrl();
		System.out.println(x);
		if(x.startsWith("https"))
		{
			System.out.println("Site is secured");
		}
		else
		{
			System.out.println("Site is not secured");
		}
        
	}

}
