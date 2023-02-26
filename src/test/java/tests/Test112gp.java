package tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GooglePage;

public class Test112gp {

	public static void main(String[] args) throws Exception
	{
       WebDriverManager.chromedriver().setup();
       RemoteWebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       GooglePage gp=new GooglePage(driver);
       driver.get("http://www.google.co.in");
       gp.fillsearchbox("Abdul Kalam azad");
       driver.quit();
	}


}
