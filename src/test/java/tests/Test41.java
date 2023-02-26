package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com");
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//span[contains(@class,'catText')])[1]")).click();
        //driver.findElement(By.linkText("View All")).click();
        driver.findElement(By.name("keyword")).sendKeys("earphones",Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[starts-with(@class,'product')])[1]")).click();  
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(@itemprop,'price')]")).getText();
        Thread.sleep(3000);
        driver.quit();
        Thread.sleep(3000);
    }

}
