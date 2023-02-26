package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test42 {

	public static void main(String[] args)  throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.ajio.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='MEN']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//button[contains(@type,'button')])[1]/following::div[3]")).click();
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[contains(@class,'imgHolder')])[5]")).click();
        Thread.sleep(3000);
        driver.quit();
        Thread.sleep(3000);
	}

}
