package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
	    Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(text(),'Get your')]")).click();
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.switchTo().window(l.get(0));
        Thread.sleep(3000);
        driver.switchTo().window(l.get(1));
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(l.get(0));
        driver.close();
        
	}

}
