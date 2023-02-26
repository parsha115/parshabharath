package tests;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		RemoteWebDriver driver=new FirefoxDriver();
		driver.get("http://hope.in");
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
