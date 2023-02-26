package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test43 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");
        Thread.sleep(3000);
        driver.switchTo().frame("iframeResult");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Get your']")).click();
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(l.get(0));
        Thread.sleep(3000);
        driver.switchTo().frame("iframeResult");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(3000);
        String x=driver.switchTo().alert().getText();
        System.out.println(x);
        Thread.sleep(3000);
        driver.quit();
	}
	
	

}
