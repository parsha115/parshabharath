package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test15 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//driver.get("http://www.flipkart.com");
		 String x="http://www.flipkart.com";
         driver.get(x);
         driver.close();
	}

}
