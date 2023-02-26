package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test19 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//define locator 
		//By b=By.name("email");
		//find element in page source using that locator
		WebElement e=driver.findElement(By.name("email"));
		//operate that element in page
				e.sendKeys("parsharam115@gmail.com");
				Thread.sleep(5000);
				

	}

}
