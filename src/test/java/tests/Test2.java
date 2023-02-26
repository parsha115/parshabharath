package tests;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args)
	{
		//download firefoxdriver software to work with firefox browser
		WebDriverManager.firefoxdriver().setup();
		
		//Access firefox browser using firefoxdriver software
		FirefoxDriver driver=new FirefoxDriver();
		
		//Lanuch site
		driver.get("http://www.amazon.in");

	}

}
