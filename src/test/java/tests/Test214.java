package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test214 {

	public static void main(String[] args) throws Exception
	{
		        //Open chrome browser 
				WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.silentOutput","true");
				ChromeOptions co=new ChromeOptions();
				co.addArguments("--disable-notifications"); //native command as argument
				RemoteWebDriver driver=new ChromeDriver(co);
				driver.manage().window().maximize();
				driver.get("https://www.magnitia.com");
				Thread.sleep(5000);
		        driver.close();
		        
	}

}
