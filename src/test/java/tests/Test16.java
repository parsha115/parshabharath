package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		String x=driver.getPageSource();
		System.out.println(x);
		if(x.contains("html"))
		{
			System.out.println("Page desinged in HTML");
		}
		else
		{
			System.out.println("Page not desined in HTML");
		}
				

	}

}
