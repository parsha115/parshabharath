package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test36 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
		Thread.sleep(2000);
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Visit W3Schools.com!")).click();
		Thread.sleep(2000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("website")).click();
		Thread.sleep(2000);
		s=driver.getWindowHandles();
		l=new ArrayList<String>(s);
		driver.switchTo().window(l.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(l.get(0));
		Thread.sleep(2000);
		driver.close();
		
	}
}
