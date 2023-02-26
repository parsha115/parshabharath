package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test212 {

	public static void main(String[] args)
	{
		ChromeOptions co=new ChromeOptions();
		String[] s=new String[]{"enable-automation"};
		co.setExperimentalOption("excludeSwitches",s); //native command as argument
		WebDriverManager.chromedriver().setup(); 
		RemoteWebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	

	}

}
