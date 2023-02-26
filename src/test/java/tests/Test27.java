package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test27 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("abdul kalam",Keys.ENTER);
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
	    //e=driver.findElement(By.name("q"));
	    e.sendKeys("APJ Abdul Kalam",Keys.ENTER);
		Thread.sleep(3000);
		driver.close();

	}

}
