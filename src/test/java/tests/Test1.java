package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args)
	{
		// download chromedriver software to work with chrome browser
		WebDriverManager.chromedriver().setup();
		//Access chrome browser using chromedriver software
		ChromeDriver driver=new ChromeDriver();
		//launch site
			driver.get("http://www.facebook.com");
	}
	
}
