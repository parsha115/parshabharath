package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test37 {

	public static void main(String[] args) throws Exception
	{
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[text()='Login'][1]/preceding::button)[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//*[contains(@height,'24')])[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[contains(@alt,'Shop Now')])[7]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//img[starts-with(@alt,'APPLE iPhone 12')])[4]")).click();
        Thread.sleep(3000);
        Set<String> s=driver.getWindowHandles();
        List<String> l=new ArrayList<String>(s);
        driver.switchTo().window(l.get(1));
        Thread.sleep(3000);
        String x=driver.findElement(By.xpath("//img[@id='price-info-icon']/preceding::div[3]")).getText();
        System.out.println(x);
        Thread.sleep(2000);
        driver.quit();
        Thread.sleep(2000);
        
        
	}

}
