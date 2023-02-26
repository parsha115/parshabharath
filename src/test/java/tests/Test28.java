package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test28 {

	public static void main(String[] args) throws Exception
	{
	   WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.get("http://www.worldometers.info/world-population");
       Thread.sleep(3000);
       String x=driver.getTitle();
       System.out.println(x);
       Thread.sleep(3000);
       driver.close();
	}

}
