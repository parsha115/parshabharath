package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test17 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		String x=driver.getWindowHandle();
		System.out.println(x);
		driver.close();

	}

}
