package tests;

import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args)
	{
		WebDriverManager.operadriver().setup();
		
		OperaDriver driver=new OperaDriver();
		
		driver.get("http://www.irctc.co.in");

	}

}
