package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test213 {

	public static void main(String[] args) throws Exception
	{
		ChromeOptions o=new ChromeOptions();
	    o.addArguments("--headless"); //native command as argument
	    WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver(o);
		Thread.sleep(5000);
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.getTitle();
		System.out.println(x);
		driver.close();
		

	}

}
