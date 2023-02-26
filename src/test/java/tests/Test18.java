package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18 {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tag_input.asp");
        driver.findElement(By.linkText("Try it Yourself »")).click();
        Set<String> x=driver.getWindowHandles();
        System.out.println(x);
        driver.quit();
	}

}
