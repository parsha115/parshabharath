package tests;

import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) 
	{
		WebDriverManager.operadriver().setup();
		RemoteWebDriver driver=new OperaDriver();
		driver.get("http://www.facebook.com");
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
